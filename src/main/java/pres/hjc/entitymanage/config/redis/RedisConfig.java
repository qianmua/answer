package pres.hjc.entitymanage.config.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import pres.hjc.entitymanage.entity.UserPojo;

import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/11
 * Time: 20:37
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<Object, UserPojo> objRedisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object,UserPojo> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<UserPojo> serializer = new Jackson2JsonRedisSerializer<>(UserPojo.class);
        template.setDefaultSerializer(serializer);
        return template;
    }
}
