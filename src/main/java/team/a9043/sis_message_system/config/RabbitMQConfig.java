package team.a9043.sis_message_system.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class RabbitMQConfig {
    /*-----------SignIn Message-----------------*/
    @Bean("signInExchange")
    public DirectExchange signInExchange(@Value("${rbmq.signIn.exchange}") String exchange) {
        return new DirectExchange(exchange);
    }

    @Bean("signInQueue")
    public Queue signInQueue(@Value("${rbmq.signIn.queue}") String queue) {
        return QueueBuilder.durable(queue).build();
    }

    @Bean("signInBinding")
    @DependsOn({"signInExchange", "signInQueue"})
    public Binding signInBinding(@Value("${rbmq.signIn.bindKey}") String bindKey,
                                 @Autowired @Qualifier("signInQueue") Queue queue,
                                 @Autowired @Qualifier("signInExchange") DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(bindKey);
    }

    /*-----------Mail Message-----------------*/
    @Bean("mailExchange")
    public DirectExchange mailExchange(@Value("${rbmq.mail.exchange}") String exchange) {
        return new DirectExchange(exchange);
    }

    @Bean("mailQueue")
    public Queue mailQueue(@Value("${rbmq.mail.queue}") String queue) {
        return QueueBuilder.durable(queue).build();
    }

    @Bean("mailBinding")
    @DependsOn({"signInExchange", "signInQueue"})
    public Binding mailBinding(@Value("${rbmq.mail.bindKey}") String bindKey,
                               @Autowired @Qualifier("mailQueue") Queue queue,
                               @Autowired @Qualifier("mailExchange") DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(bindKey);
    }
}
