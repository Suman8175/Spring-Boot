package com.suman.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}
//Step1:Create interface Coach
//Step2:Create class which implements Coach (here I'm building cricketcoach) and add @Component
//	Note:@Component treats the class as bean
//	Anyone inject Coach interface?if so ,let's inject them...(only one should be or use @Qualifier)
//Note:If there are multiple class which implements coach there arise  error as we are making interface datatypes
//Step4:Create interface DataType
//	Coach c1;
//Step4:Using democontroller constructor pass value to c1
//	democontroller(Coach coach){
//	c1=coach;
//	}
//Step5:Now using rest controller access the value
}
