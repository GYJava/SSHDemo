package com.entity;
import org.hibernate.cfg.Configuration;

import java.util.Date;

import org.hibernate.*;

public class StudentsPrintClass {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		@SuppressWarnings("deprecation")
		Students students = new Students(123, "zgy", "naa",	  new java.sql.Date(2014, 8, 18) , "diwgd");
		
		System.out.println("12321zhuzh驻足");
		
		session.save(students).toString();
		
		tx.commit();
	}
	


}
