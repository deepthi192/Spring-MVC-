package com.niit.Springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Springmvc.service.EmpService;

@Controller
public class HomeController 
{
	@Autowired
	EmpService manager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "EmpList";
	}
}