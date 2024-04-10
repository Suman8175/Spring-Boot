package com.suman.utils;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise tennis regularly";
    }
}
