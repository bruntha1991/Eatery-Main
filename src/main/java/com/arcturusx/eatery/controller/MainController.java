package com.arcturusx.eatery.controller;

import com.arcturusx.eatery.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	BusinessService businessService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "home";
	}

	@RequestMapping(value = "update-business",method = RequestMethod.GET)
	public String updateBusiness(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}