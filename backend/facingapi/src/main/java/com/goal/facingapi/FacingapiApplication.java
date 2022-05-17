package com.goal.facingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FacingapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacingapiApplication.class, args);
	}

}
