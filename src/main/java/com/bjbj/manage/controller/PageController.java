package com.bjbj.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/page/{param}")
	public String index(@PathVariable String param) {
		return param;
	}
	

}
