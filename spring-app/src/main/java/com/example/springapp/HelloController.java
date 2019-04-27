package com.example.springapp;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements EnvironmentAware {
	
	private Environment environment;

	@GetMapping(path = "/")
	public String hello() {		
		return environment.getProperty("Service","Hello World GKE!!");
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	

}
