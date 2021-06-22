package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord
{
	@GetMapping("/")
	public String helloWord()
	{
		return "hello word";
	}

}
