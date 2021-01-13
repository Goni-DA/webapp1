package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch00")

public class Ch00Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch00Controller.class);
	
	//http:// ... /webapp1/ch01/content에서의 /content가 아래 괄호안에 들어가는 것
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch00/content";  //view 이름을 리턴한 것임
	}

	
}
