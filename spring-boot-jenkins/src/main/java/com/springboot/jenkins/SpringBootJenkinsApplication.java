package com.springboot.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsApplication extends SpringBootServletInitializer{

	
	@GetMapping("/message/{name}")
	public String displayMessage(@PathVariable("name") String name) {
		return "Hi , " + name + " Welcome to Jenkins Test";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
