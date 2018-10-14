package team.a9043.sis_message_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @SuppressWarnings({"unchecked", "ConstantConditions"})
    @Bean("sisRedisTemplate")
    public RedisTemplate<String, Object> sisRedisTemplate(RedisTemplate redisTemplate) {
        StringRedisSerializer stringRedisSerializer =
            new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        return redisTemplate;
    }
}
