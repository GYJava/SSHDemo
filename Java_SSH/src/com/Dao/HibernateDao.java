package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * ��hibernate�������ݿ�
 * @author getf
 */
public class HibernateDao {

	/** sessionFactory */
	private static SessionFactory sessionFactory;

	static {
		Configuration conf = new Configuration();
		// ���������ļ�
		conf.configure("/hibernate.cfg.xml");
		// �����Ự����(sessionFactory)
		sessionFactory = conf.buildSessionFactory();
	}

	/**
	 * ��ȡ�����ݿ�ĻỰ
	 * @return �Ự
	 */
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	/**
	 * �ر����ݿ�Ự
	 */
	public static void closeSession(){
		sessionFactory.close();
	}
	/**
	 * ���Ը��¡�ɾ��������
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = getSession();
		// ��������
		Transaction tx = session.beginTransaction();
		// ����
		session.update("Ҫ���±����Ӧ��ʵ����");
		
		// �ع�����
		tx.rollback();
		// �ύ����
		tx.commit();
		
		// ɾ��
		session.delete("Ҫɾ�������Ӧ��ʵ����");
		// ������
		session.save("Ҫ��������Ӧ��ʵ����");
	}

}
