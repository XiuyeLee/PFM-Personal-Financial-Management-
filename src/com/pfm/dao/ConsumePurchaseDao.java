package com.pfm.dao;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pfm.entity.ConsumePurchase;


@Repository
public class ConsumePurchaseDao{

	@Resource
	private HibernateTemplate ht;
	
	public void save(ConsumePurchase cp){
		
		ht.save(cp);
	}
	
	public void delete(ConsumePurchase cp){
		ht.delete(cp);
	}
	
	public void update(ConsumePurchase cp){
		ht.update(cp);
	}
	
	public List<ConsumePurchase> list(){
		//一定要注意from后的类名要正确
		List<ConsumePurchase> list = (List<ConsumePurchase>) ht.find("from ConsumePurchase");
		return list;
		
	}
	
	
}
