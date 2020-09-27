package spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String getWelcomeGreetings() {
		return "<h1>Welcome</h1>";
	}
}