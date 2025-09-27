package com.company.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // POJO

	@RequestMapping("/")
	public String home(Model model) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd (E)");
		
		String sDate = sdf.format(now);
		
		model.addAttribute("message",sDate);
		return "home";  // /WEB-INF/views/home.jsp 찾기
	}
	@RequestMapping("/hi")
	public String hi() {
		return "hi";  // /WEB-INF/views/hi.jsp 찾기
	}
}
