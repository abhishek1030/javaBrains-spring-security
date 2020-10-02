package spring.security;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBrainsSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JavaBrainsSpringSecurityApplication.class);
		//app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);
	}

}
