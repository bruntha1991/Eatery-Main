package com.arcturusx.eatery.controller;

import com.arcturusx.eatery.Business;
import com.arcturusx.eatery.domain.BusinessEntity;
import com.arcturusx.eatery.service.BusinessService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	BusinessService businessService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "update-business",method = RequestMethod.GET)
	public String updateBusiness(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		updateBusiness();
		return "hello";
	}


	public void updateBusiness() {
		Business business=new Business();
		String filePathTop100BusinessReviews = "/home/bruntha/Documents/FYP/Data/English Review/" +
				"top2000Business.json";
		try {
			List businesses=business.updateTopBusiness(filePathTop100BusinessReviews);

			for (int i = 0; i < businesses.size(); i++) {
				businessService.insert((BusinessEntity) businesses.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}