package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server started");
		 SpringApplication.run(Application.class, args);
	}

}
