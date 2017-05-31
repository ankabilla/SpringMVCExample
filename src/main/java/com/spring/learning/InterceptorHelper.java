package com.spring.learning;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHelper extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws IOException{
		Calendar cal = Calendar.getInstance();
		int day = cal.get(cal.DAY_OF_WEEK);
		if(day == 1)
		{		
		    res.getWriter().write("The website is closed");	
	     	return false;
		}
		else
			return true;
	}
	
	
	@Override
	public void postHandle(HttpServletRequest req,HttpServletResponse res,
			Object handler,ModelAndView modelAndView) throws Exception{
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest req,HttpServletResponse res,
			Object handler, Exception ex) throws Exception{
		
	}
	
	
}
