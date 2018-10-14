package team.a9043.sis_message_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("team.a9043.sis_message_system.mapper")
public class SisMessageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisMessageSystemApplication.class, args);
    }
}
