package com.pfm.controler;

import java.util.UUID;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.pfm.bean.Test;
import com.pfm.dao.TestDao;

//@EnableWebMvc
//@Configuration
//@ComponentScan({"com.pfm.controler"})
@Controller
public class TestController {

	@Resource
	private TestDao testDao;

//	@Bean
//	public Test test123() {
//		return new Test();
//	}

	// @RequestMapping("/test.do")
	// @ResponseBody
	// public void test(HttpServletResponse res){
	//// res.setHeader("Access-Control-Allow-Origin", "*");
	// res.setHeader("Origin", "http://www.baidu.com");
	// res.setHeader("Access-Control-Allow-Credentials", "true");
	// try {
	// PrintWriter wtiter = res.getWriter();
	// wtiter.println("test();");
	// } catch (IOException e) {
	// e.printStackTrace();
	// }

	// try {
	// res.sendRedirect("http://www.baidu.com");
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }

	@RequestMapping("boot.do")
	@ResponseBody
	String boot() {
		return "Hello World!";
	}

	@RequestMapping("mvc.do")
	public String mvc() {
		return "mvc";
	}

	@RequestMapping("test2.do")
	public String test(Test test) {
		if(test.getName() == null){
			return "test2";
		}
		test.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		System.out.println("uuid := " + test.getUuid() + ",name := " + test.getName());
		this.testDao.test(test);
		return "test2";
	}
	@RequestMapping("test1.do")
	public String test1(Test test) {

		return "test1";
	}

//	@Resource
//	private Test test;
//
//	public Test getTest() {
//		return test;
//	}
}
