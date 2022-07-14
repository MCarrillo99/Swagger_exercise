package com.develhope.swagger01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Swagger01Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Swagger01Application.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "1234"));
		app.run(args);
	}

}
