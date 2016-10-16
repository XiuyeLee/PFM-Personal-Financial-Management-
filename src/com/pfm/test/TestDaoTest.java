package com.pfm.test;

import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfm.bean.Test;
import com.pfm.dao.TestDao;

public class TestDaoTest {

	public static void main(String[] args) {



		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDao dao = ac.getBean(TestDao.class);

		Test test = new Test();

		test.setName("五米123123");
		test.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		dao.test(test);
		System.out.println("======");
		test.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		dao.save(test);


		List l = dao.list();

		System.out.println(l.size());
		for(Object o : l){
			if(o instanceof Test){
				Test t = (Test) o;
				System.out.println("UUID:"+t.getUuid()+"\nNAME:"+t.getName());
			}
		}
	}

}
