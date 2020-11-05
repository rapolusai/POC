package com.rsp.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageCntroller {

//	@RequestMapping(value="/homepage", method=RequestMethod.GET)
	@GetMapping("/homepage")
	public String showHomePage() {
		return "Home";
	}
	
//	@RequestMapping(value="/view", method=RequestMethod.GET)
	@GetMapping("/view")
	public String findAll() {
		return "ViewAll";
	}
	
//	@RequestMapping(value="/register", method=RequestMethod.POST)
	@PostMapping("/register")
	public String registerPage() {
		System.out.println("Sai");
		return "Register";
	}

}
