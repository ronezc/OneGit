package com.zc.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zc.vo.Contact;
import com.zc.vo.Student;

public class StudentTest {

	Session session = null;
	SessionFactory sessionFactory = null;
	
	@Before
	public void before() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = con.buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
	}
	
	@Test
	public void addStudent(){
		
		Contact con = new Contact("Î÷°²ÊÐ", "110");
		Student stu = new Student("xiaoming", con);
		session.save(stu);
		
	}

	@After
	public void after() {
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
}
