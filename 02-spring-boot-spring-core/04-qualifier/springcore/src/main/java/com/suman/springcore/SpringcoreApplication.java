package com.suman.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.suman.springcore","com.suman.utils"})
public class SpringcoreApplication {

//	Spring boot application will search for class which implements the interface
//	Is there any class which implements interface..If so,which?
//	So if there are multiple class which implements  same interface error will occur
//	in our case (CricketCoach,FootballCoach,TennisCoach )all implements Coach so it will be confuse to pick
//    which class
//	So solution is use @Qualifier

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}


}
