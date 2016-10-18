package com.pfm.dao.mybatis;

import java.util.List;

import com.pfm.bean.Test;

public interface TestMapper {
	int save(Test t);

	List<Test> findAll();
}
