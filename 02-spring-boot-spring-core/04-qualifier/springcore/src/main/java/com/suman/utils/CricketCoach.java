package com.suman.utils;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{



    @Override
    public String getDailyWorkout() {
        return "Do a 15 minutes fast bowling daily!!!";
    }
}
