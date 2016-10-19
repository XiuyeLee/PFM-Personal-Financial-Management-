package com.pfm.dao.hibernate;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pfm.bean.Test;

@Repository
public class TestDao{

	@Resource
	private HibernateTemplate ht;



	@Transactional
	public void test(Test test){
		//session save  起作用
		ht.save(test);
	}
	public void delete(Test test){
		//session save  起作用
		ht.delete(test);
	}

	public void save(Test test){
		this.ht.save(test);
	}

	public List list(){
		return ht.find("from Test");
	}


}
