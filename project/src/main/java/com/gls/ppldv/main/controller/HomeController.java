package com.gls.ppldv.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main/home";
	}

	@GetMapping("search")
	public String search() {
		return "/business/search";
	}
	
	@GetMapping("searchD")
	public String searchD() {
		return "redirect:developer/search";
	}
}
