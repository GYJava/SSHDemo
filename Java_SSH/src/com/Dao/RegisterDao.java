package com.Dao;

import com.entity.OznerUser;

public interface RegisterDao {
	
	/*
	 * 用户登录方法
	 */
	OznerUser userRegister(String name,String pwd);

}
