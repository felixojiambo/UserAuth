package com.zep.UserAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserAuthApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(UserAuthApplication.class, args);
		System.out.println("User Auth");
		System.out.println("Server running on port 8084");
	}

}
