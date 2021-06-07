package com.example.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWord
{
	@GetMapping("/")
	public String helloWord()
	{
		return "hello word";
	}

}
