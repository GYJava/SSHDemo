package com.servlet;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class OznerUserDao {
	
	public static void main(String[] args) {
		
		GYBaseDao baseDao = new GYBaseDao();
		
		ArrayList<OznerUser> userList = new ArrayList<OznerUser>();
		userList = baseDao.SearchOznerUser();
		
		for (OznerUser oznerUser : userList) {
			System.out.println(oznerUser.getUserName());
		}
		System.out.println(baseDao.SearchOznerUser());
		

//		Configuration configuration = new Configuration().configure();
//		
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		
//		Session session = sessionFactory.openSession();
//		
//		Transaction tx = session.beginTransaction();
//		
//		Students students = new Students(123, "zgy", "naa",	 new Date()	, "diwgd");
//		
//		System.out.println("12321zhuzh驻足");
//		
//		session.save(students);
//		
//		tx.commit();
	}

}
