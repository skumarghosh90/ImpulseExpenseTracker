package com.impulsetech.ImpulseExpenseTracker.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableCaching
@EnableScheduling
public class AppConfig {

    @Scheduled(fixedDelay = 20000)
    public void scheduleFixedDelayTask() {
        RestTemplate template = new RestTemplate();
        //template.getFo
    }
    
}