package com.hello2.hello2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Hello")

public class Controller {
	
	@GetMapping
	public String Hello() {
		return "Aprender Springboot e ser fodão!";
	}

}


