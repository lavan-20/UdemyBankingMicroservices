package com.udemy.microservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public final String displayAlert() {
		return "Welcome to Hello World Controller. All the best!";
	}
}
