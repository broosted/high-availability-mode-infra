package com.goal.facingapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/data")
	public String index() {
		return "Getting Data from DB";
	}

	@GetMapping("/")
	public String intro() {
		return "Greetings from Spring Boot!";
	}

}