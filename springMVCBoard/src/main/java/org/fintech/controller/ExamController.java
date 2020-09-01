package org.fintech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/exam/*")
@Log4j
public class ExamController {
	
	@GetMapping("/test1")
	public String test1() {
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		
		return "test3";
	}

}
