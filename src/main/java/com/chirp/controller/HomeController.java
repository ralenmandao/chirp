package com.chirp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chirp.entity.User;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, HttpSession session){
		model.addAttribute("user", new User());
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String handle(Model model, @ModelAttribute User user){
		return "welcome";
	}
}
