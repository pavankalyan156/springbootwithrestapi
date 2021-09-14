package com.springboot.springrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping(value = "/users" , method = RequestMethod.GET)
	@ResponseBody
	public String getUsers() {
		return "Displaying the list of users";
	}
}
