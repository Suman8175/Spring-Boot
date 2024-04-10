package com.suman.springcore.restcontroller;


import com.suman.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Coach coach;




   @Autowired
    public void getCoach(Coach myCoach){
       System.out.println("Called using setter");
        this.coach=myCoach;
    }


    @GetMapping("/workout")
    public String getWorkOut(){
        return coach.getDailyWorkout();
    }

}
