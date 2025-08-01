package com.example.springintro;

import com.example.springintro.config.AppConfig;
import com.example.springintro.service.MessageService;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}
