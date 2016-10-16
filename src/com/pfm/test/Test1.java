package com.pfm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pfm.controler.TestController;
import com.pfm.entity.Test;

@Configuration
@ComponentScan({"com.pfm.controler"})
public class Test1 {

//	@Bean
//	public TestController testController(){
//		return new TestController();
//	}

//	@Bean
//	public Test test(){
//		return new Test();
//	}


	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Test1.class);
		TestController tc = ac.getBean(TestController.class);
		System.out.println(tc.test());
//		Test test = ac.getBean(Test.class);

	}

}
