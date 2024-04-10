package com.suman.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.suman.springcore","com.suman.utils"})
public class SpringcoreApplication {

//Lazy Initialization will only create the bean in following case:
//	*It is needed for dependency injection
//	*It is explicitly called
//We can initialize a class to be lazy by 2 method:
//	*Add @Lazy to each class
//	*Add spring.main.lazy-initialization=true to applications.properties
	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}


}
