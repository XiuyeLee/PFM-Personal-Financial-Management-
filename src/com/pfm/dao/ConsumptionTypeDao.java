package com.pfm.dao;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pfm.bean.ConsumptionType;


@Repository
public class ConsumptionTypeDao{

	@Resource
	private HibernateTemplate ht;
	
	public void save(ConsumptionType ct){
		
		ht.save(ct);
	}
	
	public void delete(ConsumptionType ct){
		ht.delete(ct);
	}
	
	public void update(ConsumptionType ct){
		ht.update(ct);
	}
	
	public List<ConsumptionType> list(){
		
		List<ConsumptionType> list = (List<ConsumptionType>) ht.find("from ConsumptionType");
		return list;
		
	}
	
	
}
