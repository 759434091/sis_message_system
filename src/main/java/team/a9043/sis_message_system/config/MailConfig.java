package team.a9043.sis_message_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {
    @Bean
    public MailSender mailSender() {
        Properties properties = new Properties();
        properties.put("mail.smtp.ssl.enable", "true");
        /*properties.setProperty("mail.smtp.auth", "true");//开启认证*/
        properties.setProperty("mail.debug", "false");//启用调试
        properties.setProperty("mail.smtp.timeout", "1000");//设置链接超时
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net" +
                ".ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.socketFactory.port", "465");//设置ssl端口
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");
        mailSender.setPort(465);
        mailSender.setUsername("2541175183@qq.com");
        mailSender.setPassword("atnnogsndzfaebch");
        mailSender.setJavaMailProperties(properties);
        mailSender.setDefaultEncoding("UTF-8");
        return mailSender;
    }
}
