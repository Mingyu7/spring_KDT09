package com.office.library.user.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserMemberLoginInterceptor extends HandlerInterceptorAdapter {
	
	// 로그인 화면으로 이동시키기
	 @Override 
	   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	         throws Exception {
	      HttpSession session = request.getSession();
	      if(session !=null) {
	         Object object = session.getAttribute("loginedUserMemberVo");
	         if(object !=null)
	            return true;
	      }
	      response.sendRedirect(request.getContextPath()+"/user/member/lgoinForm");
	      return false;
	   }

	
}
