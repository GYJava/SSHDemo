package com.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entity.Students;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentsService;

@Controller
public class FindStudentsAction extends ActionSupport{

	
	//此处要使用service层
	@Resource
	private StudentsService studentsService;
	
	private List<Students> studentsList;
	
	public String FindStudents() {
		
		studentsList = studentsService.getAllStudents();
		
		System.out.println("==========================" + studentsList);
		
		return "success1";
		
	}
	
	public void setStudentsService(StudentsService studentsService) {
		this.studentsService = studentsService;
	}

}
