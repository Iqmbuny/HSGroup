package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.EnquiryService;

@Controller
public class MainController {
	
	
	 @Autowired private EnquiryService service;
	 
	
	@RequestMapping("/page")
	public String getPage() {
		return "HomePage";
	}
	
	

}
