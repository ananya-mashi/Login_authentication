package com.ananya.ravionics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ananya.ravionics.bean.User;
import com.ananya.ravionics.service.UserService;

@Controller
public class UserController {
	
	
	private UserService userService;
	@Autowired
	public UserController(UserService theService) {
		userService = theService;
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	@PostMapping("/home")
	public String home(@RequestParam("name")String USERNAME,@RequestParam("pass")String PASSWORD) {
		int flag=0;
	User user=	userService.findByUSERNAME(USERNAME);
	if(user!=null) {
		if(user.getUSERNAME().equalsIgnoreCase(USERNAME)&&user.getPASSWORD().equalsIgnoreCase(PASSWORD)) {
			
			flag=1;
		}
	}
if (flag==1)
	return "home";
else
	return "login";
	}
	}


	
	
