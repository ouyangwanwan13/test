package com.serviceImpl;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.model.UserModel;
@Mapper
public interface UserServiceImpl {
	
	@Select("select * from user where id = #{id}")
	UserModel selectByID(int id);
}
