package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;
import com.mysql.jdbc.PreparedStatement;
import com.tools.MyConnection;

public class StudentsDaoImp implements StudentsDao {

	@Resource
	private MyConnection c;
	
	public void setC(MyConnection c) {
		this.c = c;
	}
	
	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		/*
		Connection connection = c.getConnection();
		
		String sql = "select * from  Students";
		
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		List<Students> list = new ArrayList<Students>();
		
		try {
			
			while (resultSet.next()) {
				
				Students students = new Students();
				
				students.setSid(resultSet.getInt("sid"));
				students.setName(resultSet.getString("name"));
				students.setGender(resultSet.getString("gender"));
				students.setBirthday(resultSet.getDate("birthday"));
				students.setAddress(resultSet.getString("address"));
				list.add(students);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
	    Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String hql = "FROM Students";
		
		Query query = session.createQuery(hql);
		List results = query.list();
		
		System.out.println("=====================" + results + "=====================");
		return results;
	}
	

	
}
