package com.amigoscode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

/**
 * First of all, we are going to add annotation @RestController
 */
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public String helloWorld() {
		return "Hello from @RestController";
	}

}
