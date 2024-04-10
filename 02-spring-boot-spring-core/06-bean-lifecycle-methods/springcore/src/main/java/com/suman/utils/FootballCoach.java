package com.suman.utils;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void beforeMakingBean(){
        System.out.println("Initializing database");
    }


    @PreDestroy
    public void beanDestroy(){
        System.out.println("Clearing up resources");
    }
}
