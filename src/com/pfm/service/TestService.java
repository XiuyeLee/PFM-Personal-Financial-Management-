package com.pfm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pfm.bean.Test;
import com.pfm.dao.hibernate.TestDao;
import com.pfm.dao.mybatis.TestMapper;

@Service
public class TestService {

	public TestService() {

	}

	@Resource
	private TestDao testDao;

	@Resource
	private TestMapper testMapper;

	public void save(Test test) {
		this.testDao.save(test);
	}

	public int saveTest(Test t) {
		return this.testMapper.save(t);
	}

	public List<Test> list() {

		return this.testMapper.findAll();

	}

}
