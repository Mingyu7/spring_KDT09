package com.office.library.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

	// @RequestMapping(value = {"", "/"}, method = RequestMethod.GET) // /admin , /admin/ 모두 실행되게  
	@GetMapping(value = {"", "/"}) // 현재는 @GetMapping, @PostMapping을 사용함 
	public String home() {
		System.out.println("[AdminHomeController] home()");
		
		String nextPage = "admin/home"; // views 의 admin폴더 안에 home.jsp 를 찾음
		
		return nextPage;
		
	}

}