package com.demo.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

	@Before("execution(** concert.Performance.perform(..))")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}

	@Before("execution(** concert.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	@AfterReturning("execution(** concert.Performance.perform(..))")
	public void applause(){
		System.out.println("Taking seats");
	}
	@AfterThrowing("execution(** concert.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("Taking seats");
	}
	@Around("execution(** concert.Performance.perform(..))")
	public void watchPerformance(ProceedingJoinPoint jp){

		try{

			System.out.println("Silencing seats");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");

		}
		catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("Demanding a refund!");
		}

	}

}
