package com.goal.facingapi.controller;

import java.util.List;

import com.goal.facingapi.model.UserData;
import com.goal.facingapi.repo.UserDataRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private UserDataRepo userDataRepo;

	@GetMapping("/api/data")
	public ResponseEntity<List<UserData>> index() {
		return new ResponseEntity<>(userDataRepo.findAll(),HttpStatus.OK);
	}

	@GetMapping("/")
	public String intro() {
		return "Greetings from Spring Boot!";
	}

}