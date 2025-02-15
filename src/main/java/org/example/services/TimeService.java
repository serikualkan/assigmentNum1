package org.example.services;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {
    public String getCurrentTime() {
        return "Текущее время: " + LocalTime.now().toString();
    }
}
