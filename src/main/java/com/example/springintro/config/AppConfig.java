package com.example.springintro.config;

import com.example.springintro.service.MessageService;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }
}
