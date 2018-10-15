package team.a9043.sis_message_system.service;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.a9043.sis_message_system.entity.*;
import team.a9043.sis_message_system.mapper.SisCourseMapper;
import team.a9043.sis_message_system.mapper.SisJoinCourseMapper;
import team.a9043.sis_message_system.mapper.SisScheduleMapper;
import team.a9043.sis_message_system.mapper.SisUserMapper;
import team.a9043.sis_message_system.service_pojo.*;
import team.a9043.sis_message_system.util.SisScheduleUtil;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
@Slf4j
@RabbitListener(queues = "${rbmq.queue}")
public class MessageService {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private SisJoinCourseMapper sisJoinCourseMapper;
    @Resource
    private SisScheduleMapper sisScheduleMapper;
    @Resource
    private SisUserMapper sisUserMapper;
    @Resource(name = "sisRedisTemplate")
    private RedisTemplate<String, Object> sisRedisTemplate;
    @Resource
    private SisCourseMapper sisCourseMapper;
    private String formIdKeyFormat = "sis_formid_openid_%s";

    @SuppressWarnings("ConstantConditions")
    @RabbitHandler(isDefault = true)
    public boolean sendSignInMessage(SignInMessage signInMessage) {
        String accessToken = (String) sisRedisTemplate.opsForValue().get("wx_access_token");
        if (null == accessToken) return false;
        SisSchedule sisSchedule = sisScheduleMapper.selectByPrimaryKey(signInMessage.getSsId());
        if (null == sisSchedule) return false;
        LocalDateTime signInEndTime = signInMessage.getLocalDateTime();
        SisCourse sisCourse = sisCourseMapper.selectByPrimaryKey(sisSchedule.getScId());
        if (null == sisCourse) return false;

        SisJoinCourseExample sisJoinCourseExample = new SisJoinCourseExample();
        sisJoinCourseExample.createCriteria().andScIdEqualTo(sisSchedule.getScId());
        List<SisJoinCourse> sisJoinCourseList = sisJoinCourseMapper.selectByExample(sisJoinCourseExample);
        if (sisJoinCourseList.isEmpty()) return false;

        List<String> suIdList = sisJoinCourseList.stream().map(SisJoinCourse::getSuId).collect(Collectors.toList());
        SisUserExample sisUserExample = new SisUserExample();
        sisUserExample.createCriteria().andSuIdIn(suIdList);
        List<SisUser> sisUserList = sisUserMapper.selectByExample(sisUserExample);

        List<String> openidList = sisUserList.stream().map(SisUser::getSuOpenid).filter(Objects::nonNull).distinct().collect(Collectors.toList());
        if (openidList.isEmpty()) return false;


        String urlFormat = "/cgi-bin/message/wxopen/template/send?access_token=%s";
        String signInTemplateId = "J-dpmRqRsK2H6TI_lLE_90Z3U8xKBAiArSM5Prn7D14";
        String wxAppUrlFormat = "/pages/student/sign/sign?scId=%s";
        String schTime = String.format(SisScheduleUtil.timeFormat,
                SisScheduleUtil.fortMap.get(sisSchedule.getSsFortnight()),
                sisSchedule.getSsStartWeek(),
                sisSchedule.getSsEndWeek(),
                SisScheduleUtil.dayMap.get(sisSchedule.getSsDayOfWeek()),
                sisSchedule.getSsStartTime(),
                sisSchedule.getSsEndTime(),
                sisSchedule.getSsRoom());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        CompletableFuture[] completableFutures = openidList.stream()
                .map(openid -> CompletableFuture.runAsync(() -> {
                    String key = String.format(formIdKeyFormat, openid);

                    FormId formId;
                    while ((formId = (FormId) sisRedisTemplate.opsForList().rightPop(key)) == null || formId.getLocalDateTime().isBefore(LocalDateTime.now()))
                        if (sisRedisTemplate.opsForList().size(key) == null || sisRedisTemplate.opsForList().size(key) <= 0)
                            return;

                    JSONObject kw1 = new JSONObject();
                    kw1.put("value", sisCourse.getScName());
                    JSONObject kw2 = new JSONObject();
                    kw2.put("value", df.format(signInEndTime));
                    JSONObject kw3 = new JSONObject();
                    kw3.put("value", schTime);
                    JSONObject data = new JSONObject();
                    data.put("keyword1", kw1);
                    data.put("keyword2", kw2);
                    data.put("keyword3", kw3);
                    JSONObject request = new JSONObject();
                    request.put("template_id", signInTemplateId);
                    request.put("page", String.format(wxAppUrlFormat, sisCourse.getScId()));
                    request.put("touser", openid);
                    request.put("data", data);
                    request.put("emphasis_keyword", "keyword1.DATA");
                    request.put("form_id", formId.getFormId());

                    HttpEntity<JSONObject> httpEntity = new HttpEntity<>(request);
                    JSONObject jsonObject = restTemplate.postForObject(String.format(urlFormat, accessToken), httpEntity, JSONObject.class);
                    if (null != jsonObject && jsonObject.has("errcode") && jsonObject.getInt("errcode") != 0)
                        log.error(String.format("Send message error: openid %s, %s", openid, jsonObject.toString()));
                }))
                .toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(completableFutures)
                .whenComplete((r, e) -> {
                    if (null != e)
                        log.info(e.getMessage());
                    else
                        log.info("success sendSignInMessage: " + sisCourse.getScId() + ", " + sisSchedule.getSsId());
                });
        return true;
    }
}
