package com.pfm.test;

import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfm.bean.ConsumptionType;
import com.pfm.dao.hibernate.ConsumptionTypeDao;

public class ConsumptionTypeDaoTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ConsumptionTypeDao dao = ac.getBean(ConsumptionTypeDao.class);

		ConsumptionType ct = new ConsumptionType();
		ct.setId(1);
		ct.setType("网费");
		ct.setParentTypeId(0);
		//dao.save(ct);
		//dao.delete(ct);
		List<ConsumptionType> l = dao.list();

		System.out.println(l.size());
		for (ConsumptionType o : l) {
			System.out.println("ID := " + o.getId() + "\nTYPE := "
					+ o.getType() + "\nPARENT_TYPE_ID := "
					+ o.getParentTypeId());
		}
	}
}
