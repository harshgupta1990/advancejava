package com.wap2teach.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BasicSpringBootApplication {
	
	//http://localhost:8080

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootApplication.class, args);
		System.out.println("Hello");
	}
	 
	

}
