package com.application.packersmovers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.packersmovers.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/usrItem")
	public ModelAndView loadusrItem() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usrItem");
		mv.addObject("HSE_HOLD_ITMS", userService.loadusrItem());
		return mv;
	}

}
