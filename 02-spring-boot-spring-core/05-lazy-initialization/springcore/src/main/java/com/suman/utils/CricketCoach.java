package com.suman.utils;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do a 15 minutes fast bowling daily!!!";
    }
}
