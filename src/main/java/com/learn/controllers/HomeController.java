package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	
//	home page
	@GetMapping("/home")
	public String home() {
		return "this is a home page";
	}
	
//	login page
	@GetMapping("/login")
	public String login() {
		return "this is a login page";
	}
	
//	register page
	@GetMapping("/register")
	public String register() {
		return "this is a register page";
	}
	
	
}
