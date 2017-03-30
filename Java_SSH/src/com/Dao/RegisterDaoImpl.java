package com.Dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.entity.OznerUser;
import com.tools.TokenProcessor;

@Repository("registerDao")
public class RegisterDaoImpl extends HibernateDao implements RegisterDao {

	@Override
	public OznerUser userRegister(String name, String pwd) {

		
		Session session = HibernateDao.getSession();
		
		Transaction tx = session.beginTransaction();
		
//		String hql = "insert into OznerUser";
		
		OznerUser user = new OznerUser();
		user.setId(50);
		user.setName(name);
		user.setPwd(pwd);
		String token = new TokenProcessor().generateToken(name, true);
		user.setToken(token);
		session.save(user);
		
		tx.commit();
//		HibernateDao.closeSession();
		return user;
	}

}
