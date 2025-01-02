package com.example.hellocd;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HellocdApplication {


	@RequestMapping("/")
	String home() {
		return "Hello My Baby, happy learning CI/CD implementation";
	}

	public static void main(String[] args) {
		SpringApplication.run(HellocdApplication.class, args);
	}

}
