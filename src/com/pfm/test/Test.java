package com.pfm.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pfm.dao.hibernate.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:applicationContext.xml"
})
public class Test {

	@Resource
	private TestDao testDao;

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(testDao);
		com.pfm.bean.Test t = new com.pfm.bean.Test();
		t.setName("fadfsd");
		testDao.test(t);
		List list = testDao.list();
		for(Object o : list)
		{
			testDao.delete((com.pfm.bean.Test) o);
		}

	}

}
