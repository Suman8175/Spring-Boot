package com.suman.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.suman.springcore","com.suman.utils"})
public class SpringcoreApplication {

//Bean Life Cycle is important
//	Using bean life cycle we can initialize database,files,etc when bean is initialize and destroy/release
//	all resources used before destroying bean
//			@PostConstruct for bean initialization
//			@PreDestroy for bean destroy
	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}


}
