package com.pfm.test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.pfm.bean.Test;
import com.pfm.dao.hibernate.TestDao;

public class TestDaoTest {

	static{
		try {
			Log4jConfigurer.initLogging("classpath:config/properties/log4j.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {



		ApplicationContext ac = new ClassPathXmlApplicationContext("config/xml/applicationContext.xml");
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
