package com.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class publicInfoController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
