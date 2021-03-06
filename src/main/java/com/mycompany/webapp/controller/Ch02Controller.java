package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ch02")
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch02/content";
	}
	//@RequestMapping("/request1") //GET, POST 둘다 지원
	//@RequestMapping(value="/getMethod", method=RequestMethod.GET) //GET 메소드만 지원
	//@RequestMapping(value="/request1", method=RequestMethod.POST) //POST 메소드만 지원
	@GetMapping("/getMethod")
	public String getMethod() {
		logger.info("실행");
		return "ch02/content";
	}
	
	//@RequestMapping(value="/postMethod", method=RequestMethod.POST)
	@PostMapping("/postMethod")
	public String postMethod() {
		logger.info("실행");
		return "ch02/content";
	}
	
	//@RequestMapping(value="/join", method=RequestMethod.GET)
	@GetMapping("/join")
	public String joinForm() {
		logger.info("해원가입 양식을 보냄");
		return "ch02/joinForm";
	}
	
	//@RequestMapping(value="/join", method=RequestMethod.POST)
	@PostMapping("/join")
	public String join() {
		logger.info("해원가입 처리함");
		return "ch02/content";
	}
	
	//@RequestMapping(value="/joinAsync", method=RequestMethod.GET)
	@GetMapping("/joinAsync")
	public String joinFormAsync() {
		logger.info("해원가입 양식을 보냄");
		return "ch02/joinFormAsync";
	}
	
	@GetMapping("/RaiseGoni")
	public String RaiseGoni() {
		logger.info("음식을 먹임");
		return "ch02/RaiseGoni";
	}
	
	@PostMapping("/raise")
	public String raise() {
		logger.info("키우기완료함");
		return "ch02/raisedone";
	}
	
	@PostMapping("/back")
	public String back() {
		logger.info("돌아갑시다.");
		return "ch02/content";
	}
	
}
