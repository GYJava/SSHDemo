package com.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.entity.OznerUser;
import com.opensymphony.xwork2.ActionSupport;
import com.service.LoginService;

public class LoginAction extends ActionSupport{
	
	@Resource
	private LoginService loginService;
	
	private String loginFlag;
	private String name;
	private String pwd;
	private OznerUser oznerUser;
	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	public String Login() {
		
		return "oznerInfo";
		
	}
	
	public String LoginFuction() {
//		loginFlag = "0";
		Object object = loginService.login(name, pwd, loginFlag);
		
		System.out.println("loginFlag"+loginFlag);
//		return "oznerInfo1";
		if (object != null) {
			
			if ("0".equals(loginFlag)) {
				oznerUser = (OznerUser)object;
				
				HttpSession session = ServletActionContext.getRequest().getSession();
				//将信息存入session中
				session.setAttribute("oznerUser", oznerUser);
				int id = oznerUser.getId();
				return "oznerInfo1";
				
			}
		}
		
		return null;
		
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	public OznerUser getOznerUser() {
		return oznerUser;
	}

	public void setOznerUser(OznerUser oznerUser) {
		this.oznerUser = oznerUser;
	}
	
	

}
