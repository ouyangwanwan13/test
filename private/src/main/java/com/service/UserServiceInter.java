package com.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.model.UserModel;
@Service
public interface UserServiceInter {
	
	public UserModel selectUser(int id);
}
