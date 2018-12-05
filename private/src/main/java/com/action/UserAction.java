package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserModel;
import com.service.UserService;
@RestController
public class UserAction {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/query")
	public String queryUser() {
		UserModel a= userService.selectUser(1);
		return a.getPassword();
		
	}
}
