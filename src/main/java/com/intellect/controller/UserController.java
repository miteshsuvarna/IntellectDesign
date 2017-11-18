package com.intellect.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	ArrayList list = new ArrayList();
	@RequestMapping(value = "/createuser/", method = RequestMethod.POST)
	public void createUser(){
		System.out.println("hello");
	}
	@RequestMapping(value = "/updateuser/", method = RequestMethod.POST)
	public void updateUser(){
		
	}
	@RequestMapping(value = "/deleteuser/", method = RequestMethod.POST)
	public void deleteUser(){
		
	}
	@RequestMapping(value = "/viewAll/", method = RequestMethod.GET)
	public String viewAll(){
		return "Hello there";
	}
}
