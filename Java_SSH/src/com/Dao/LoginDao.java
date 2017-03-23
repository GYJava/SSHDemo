package com.Dao;

import com.entity.OznerUser;

public interface LoginDao {

	/*
	 * 用户登录方法
	 */
	OznerUser userLogin(String name,String pwd);
}
