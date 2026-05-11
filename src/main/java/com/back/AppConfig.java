package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    int version() {
        return 55;
    }


    @Bean
    public ApplicationRunner myApplicationRunner() {
        return new MyApplicationRunner();
    }

    @Bean
    public ApplicationRunner myApplicationRunner2() {
        return new MyApplicationRunner();
    }
}