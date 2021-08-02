package com.Sport.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@RequestMapping("/products")
	public String Products() {

		return "products";
	}

	@RequestMapping("/su")
	public String Form() {

		return "su";
	}
	@RequestMapping("/final")
	public String book() {

		return "final";
	}

	@RequestMapping("/contact")
	public String Contact() {

		return "contact";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/Successfull")
	public String success() {
		return"Successfull";
	}

}
