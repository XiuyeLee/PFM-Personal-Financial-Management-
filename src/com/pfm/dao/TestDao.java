package com.pfm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pfm.entity.Test;

@Repository
public class TestDao{

	@Resource
	private HibernateTemplate ht;
	
	@Resource
	private SessionFactory sf;
	
	public void test(Test test){
		//session save  起作用
		ht.save(test);
		
	}
	
	public int save(Test test){
		Session s = sf.openSession();
		s.beginTransaction();
		//不知道为什么session save不起作用
		SQLQuery q = s.createSQLQuery("insert into test(uuid,name) values('"+test.getUuid()+"','"+test.getName()+"')");
		int i = q.executeUpdate();
		s.getTransaction().commit();
		s.close();
		return i;
	}
	
	public List list(){
		Session s = sf.openSession();
		s.beginTransaction();
		Query q = s.createQuery("from Test");
		List l = q.list();
		s.getTransaction().commit();
		s.close();
		return l;
	}
	
	
}
