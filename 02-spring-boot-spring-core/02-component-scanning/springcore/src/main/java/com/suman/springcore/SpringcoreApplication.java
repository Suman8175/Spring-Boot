package com.suman.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.suman.springcore","com.suman.utils"})
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}
//By Default springboot can only configure the packages in it or sub packages.
//		Meaning if there is main package as com.suman.springcore in my case springboot application
//		can only configure packages in it.
//So if you want other packages also to be scan use
//@SpringBootApplication(scanBasePackages = {"packages","packages"})

}
