package com.pfm.controler;



import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pfm.entity.Test;

@Controller
public class TestController {

	@Bean
	public Test test123(){
		return new Test();
	}

//	@RequestMapping("/test.do")
//	@ResponseBody
//	public void test(HttpServletResponse res){
////		res.setHeader("Access-Control-Allow-Origin", "*");
//		res.setHeader("Origin", "http://www.baidu.com");
//		res.setHeader("Access-Control-Allow-Credentials", "true");
//		try {
//			PrintWriter wtiter = res.getWriter();
//			wtiter.println("test();");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try {
//			res.sendRedirect("http://www.baidu.com");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}

	@RequestMapping("boot.do")
    @ResponseBody
    String boot() {
        return "Hello World!";
    }

	@RequestMapping("mvc.do")
	public String mvc(){
		return "mvc";
	}

	@RequestMapping("test.do")
	public String test(){
		return "test";
	}

	@Resource
	private Test test;

	public Test getTest(){
		return test;
	}
}
