package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${username:weidingyi}")
	private String name;


	
	@RequestMapping("/testapollo")
	public String tt(){
		return name;
	}
	
}
