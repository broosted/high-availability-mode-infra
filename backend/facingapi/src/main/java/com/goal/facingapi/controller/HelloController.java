package com.goal.facingapi.controller;

import com.goal.facingapi.repo.UserDataRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private UserDataRepo userDataRepo;

	@GetMapping("/api/data")
	public String index() {
		return String.valueOf(userDataRepo.findAll());
	}

	@GetMapping("/")
	public String intro() {
		return "Greetings from Spring Boot!";
	}

}