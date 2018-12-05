package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.model.UserModel;
import com.serviceImpl.UserServiceImpl;
@Component
@Service
public class UserService implements UserServiceInter {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Cacheable(value = "db0" ,key = "targetClass + methodName +#p0")
	public UserModel selectUser(int id) {
		
		return 	userServiceImpl.selectByID(id);
	}
}
