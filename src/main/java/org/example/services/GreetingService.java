package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String getGreeting() {
        return "Привет! Добро пожаловать в Spring-проект!";
    }
}
