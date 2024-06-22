package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitProjectApplication {

	public static void main(String[] args) {
		
		System.out.println("this is a simple Git project...");
		SpringApplication.run(GitProjectApplication.class, args);
	}

}
