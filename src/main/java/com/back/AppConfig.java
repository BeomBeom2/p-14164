package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {
    @Bean
    int version() {
        return 55;
    }


    @Bean
    @Order(2)
    public ApplicationRunner myApplicationRunner() {
        return new MyApplicationRunner();
    }

    @Bean
    @Order(1)
    public ApplicationRunner myApplicationRunner2() {
        return new MyApplicationRunner2();
    }
}