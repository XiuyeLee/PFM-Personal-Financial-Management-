package com.pfm.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfm.bean.ConsumePurchase;
import com.pfm.dao.ConsumePurchaseDao;

public class ConsumePurchaseDaoTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ConsumePurchaseDao dao = ac.getBean(ConsumePurchaseDao.class);

		ConsumePurchase cp = new ConsumePurchase();
		cp.setAdditionContent("blank");
		cp.setConsumeDate(new Date());
		cp.setConsumePlace("China");
		cp.setConsumptionId(1);
		cp.setCost(100);
		//可以不要
//		cp.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));

		dao.save(cp);
//		dao.delete(cp);
		List<ConsumePurchase> l = dao.list();

		System.out.println(l.size());
		for (ConsumePurchase o : l) {
//			dao.delete(o);
			System.out.println("UUID := " + o.getUuid() + "\nCONSUMPTIONID := "
					+ o.getConsumptionId() + "\nCOST := " + o.getCost());
		}
	}
}
