package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.StudentsDao;
import com.entity.Students;

@Service()
public class StudentsServiceImpl implements StudentsService{
	
	private List<Students> studentsList;
	
	@Resource
	private StudentsDao studentsDao;

	public void setStudentsDao(StudentsDao studentsDao) {
		this.studentsDao = studentsDao;
	}
	
	public List<Students> getAllStudents() {

		studentsList = studentsDao.getAllStudents();
		System.out.println("=====================StudentsServiceImpl"  + "=====================");

		return studentsList;
	}

	
	
	public List<Students> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}
	
	

}
