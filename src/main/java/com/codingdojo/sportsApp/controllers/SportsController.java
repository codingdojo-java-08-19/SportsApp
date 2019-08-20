package com.codingdojo.sportsApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.sportsApp.services.SportService;

@Controller
public class SportsController {
	
	private final SportService ss;
	public SportsController(SportService ss) {
		this.ss = ss;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}
