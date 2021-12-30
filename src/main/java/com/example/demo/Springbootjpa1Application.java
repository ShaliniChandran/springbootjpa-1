package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springbootjpa1Application {

	@GetMapping("/message")
	public String message() {
		return "Congrats on your first demo in Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(Springbootjpa1Application.class, args);
	}

}
