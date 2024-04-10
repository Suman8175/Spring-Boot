package com.suman.utils;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Buy a football and practise scoring";
    }
}
