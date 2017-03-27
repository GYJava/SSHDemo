package com.entity;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IndexAction你是最帅的");
		return "success";
	}
}
