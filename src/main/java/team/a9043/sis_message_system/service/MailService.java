package team.a9043.sis_message_system.service;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import team.a9043.sis_message_system.service_pojo.SisContact;

import javax.annotation.Resource;

@Service
@Slf4j
@RabbitListener(queues = "${rbmq.mail.queue}")
public class MailService {
    @Resource
    private MailSender mailSender;

    @SuppressWarnings("ConstantConditions")
    @RabbitHandler(isDefault = true)
    public void sendMail(SisContact sisContact) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("2541175183@qq.com");
        mailMessage.setSubject(sisContact.getSctName());
        mailMessage.setText(new JSONObject(sisContact).toString(2));
        mailMessage.setTo("a90434957@live.cn");
        mailSender.send(mailMessage);
        log.info("send email :" + sisContact.getSctContact());
    }
}
