package com.javatechie.spring.boot.docker.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started ....");
	}
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to JavaTechie..!!";
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
