package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.RegisterDao;
import com.entity.OznerUser;

@Service("registerservice")
public class RegisterserviceImpl implements Registerservice{

	@Resource
	private RegisterDao registerDao;
	
	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}
	public OznerUser userRegister(String name, String pwd) {
		
		
		return registerDao.userRegister(name, pwd);
	}
	
	
	

}
