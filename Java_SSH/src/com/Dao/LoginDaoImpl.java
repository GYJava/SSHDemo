package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.entity.OznerUser;

//@Repository
// 自动生成名为loginDaoImpl的Bean
public class LoginDaoImpl implements LoginDao {

	@Override
	public OznerUser userLogin(String name, String pwd) {

		Configuration configuration = new Configuration().configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

//		String hql = "from OznerUser where name= '"+name+"' and pwd = '"+pwd+"'";
		String hql = "from OznerUser where name= ? and pwd = ?";
//		String hql = "FROM OznerUser";
//		Object[] parm = new Object[] { name, pwd };
		System.out.println("LoginDaoImpl查询中");
		Query query = session.createQuery(hql).setString(0, name).setString(1, pwd);
//		Query query = session.createQuery(hql);
		if (query != null) {
			System.out.println("LoginDaoImpl查询成功");
			List<OznerUser> users = query.list();
			return users.get(0);

		}

		return null;
	}

}
