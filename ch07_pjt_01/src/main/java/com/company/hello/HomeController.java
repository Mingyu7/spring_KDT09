package com.company.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // POJO

	@RequestMapping("/")
	public String home() {
		return "home";  // /WEB-INF/views/home.jsp 찾기
	}
	
}
