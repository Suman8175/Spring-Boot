package com.suman.utils;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Buy a football and practise scoring";
    }
}
