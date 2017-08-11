package com.java.student.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.student.service.StudentService;

@Controller
public class StudentController {
	
	private static final Logger logger = Logger.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(){
		System.out.println("========================"+studentService.login());
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String logInPage(){
		//System.out.println("========================"+studentService.login());
		return "login";
	}
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
}
