package com.pfm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pfm.bean.Test;
import com.pfm.dao.TestDao;

@Service
public class TestService {

	public TestService() {

	}

	@Resource
	private TestDao testDao;

	public void save(Test test){
		this.testDao.save(test);
	}

}
