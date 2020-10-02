package spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	//No Authentication required 
	//Available to everyone
	@GetMapping("/")
	public String getWelcomeGreetings() {
		return "<h1>Welcome all</h1>";
	}

	//Available to user/admin
	@GetMapping("/user")
	public String getWelcomeUser() {
		return "<h1>Welcome User</h1>";
	}
	
	//Available to only admin
	@GetMapping("/admin")
	public String getWelcomeAdmin() {
		return "<h1>Welcome Admin</h1>";
	}

}
