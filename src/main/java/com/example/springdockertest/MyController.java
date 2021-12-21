package com.example.springdockertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/spring-docker/data")
	public String testData() {
		System.out.println("in DEMO");
		return "in DEMO";
		
	}

}
