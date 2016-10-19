package com.demo.config.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {

	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){

	}

	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}

	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("Taking seats");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Taking seats");
	}

}
