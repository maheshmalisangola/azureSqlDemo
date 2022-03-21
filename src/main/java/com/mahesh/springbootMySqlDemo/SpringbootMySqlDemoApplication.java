package com.mahesh.springbootMySqlDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMySqlDemoApplication {
	
	@GetMapping("/test")
	public String test() {
		return "Hello Mahesh";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMySqlDemoApplication.class, args);
	}

}
