package com.spring.security.ldap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String getWelcomeMessage() {
		return "Home Page";
	}
}
