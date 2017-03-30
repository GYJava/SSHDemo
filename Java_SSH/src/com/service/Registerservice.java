package com.service;

import com.entity.OznerUser;

public interface Registerservice {

	/*
	 * 用户登录方法
	 */
	OznerUser userRegister(String name,String pwd);
	
}
