package org.example;

import org.example.config.AppConfig;
import org.example.services.GreetingService;
import org.example.services.TimeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Загружаем контекст Spring из конфигурационного класса
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бины из контекста
        GreetingService greetingService = context.getBean(GreetingService.class);
        TimeService timeService = context.getBean(TimeService.class);

        // Используем методы бинов
        System.out.println(greetingService.getGreeting());
        System.out.println(timeService.getCurrentTime());

        // Закрываем контекст
        context.close();
    }
}

//GITHUB
