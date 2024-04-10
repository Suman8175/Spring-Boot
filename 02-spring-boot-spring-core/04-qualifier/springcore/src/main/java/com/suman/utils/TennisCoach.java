package com.suman.utils;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practise tennis regularly";
    }
}
