package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {
	
	@GetMapping
	public String Hello() {
		return "Utilizei as habilidades de persistencia, atenção aos detalhes, orientação ao futuro e mentalidade de crescimento";
	}

}
