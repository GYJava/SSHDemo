package com.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.LoginDao;
import com.entity.OznerUser;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

//	@Autowired
	//以类名为主
	@Resource
	private LoginDao loginDao;
	
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	/*
	 * lofinFlag 可以区分不同的登录方式
	 * @see com.service.LoginService#login(java.lang.String, java.lang.String, java.lang.String)
	 */
	public Object login(String name, String pwd, String loginFlag) {

		System.out.println("loginService");
		if ("0".equals(loginFlag)) {
			System.out.println("loginServiceloginFlag");
			OznerUser user = loginDao.userLogin(name, pwd);
			return user;
			
		}
		
		return null;
	}
	
	

}
