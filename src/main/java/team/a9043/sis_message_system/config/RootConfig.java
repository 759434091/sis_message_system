package team.a9043.sis_message_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.TaskUtils;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class RootConfig {
    @Bean
    public ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy() {
        return new ThreadPoolExecutor.CallerRunsPolicy();
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy) {
        ThreadPoolTaskScheduler threadPoolTaskScheduler =
                new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(20);
        threadPoolTaskScheduler.setRejectedExecutionHandler(callerRunsPolicy);
        threadPoolTaskScheduler.setErrorHandler(TaskUtils.LOG_AND_PROPAGATE_ERROR_HANDLER);
        threadPoolTaskScheduler.initialize();
        return threadPoolTaskScheduler;
    }
}
