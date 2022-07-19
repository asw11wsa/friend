package com.friend.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = {"","/","/main"})
	public String index() {
		return "index";
	}
}
