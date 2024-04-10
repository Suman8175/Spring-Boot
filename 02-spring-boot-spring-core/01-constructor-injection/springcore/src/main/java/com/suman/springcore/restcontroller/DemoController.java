package com.suman.springcore.restcontroller;


import com.suman.springcore.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Coach coach;


    @Autowired
    public DemoController(Coach myCoach) {
        System.out.println("Called using constructor injection");
        this.coach = myCoach;
    }


    @GetMapping("/workout")
    public String getWorkOut(){
        return coach.getDailyWorkout();
    }

}
