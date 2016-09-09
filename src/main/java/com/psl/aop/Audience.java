package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){
		
	}
	
	@Before(value="dummy()")
	public void audienceTakeSeats(){
		System.out.println("Audience take seats");
	}
	
	@Before(value="dummy()")
	public void switchOffPhones(){
		System.out.println("audience switch off phone");
	}
	
	@AfterThrowing(value="dummy()")
	public void demandRefund(){
		System.out.println("Boo...audience demanding refund");
	}
	
	public void applaud(){
		System.out.println("audinece applaud...CLAP CLAP");
	}
	
	public void goHome(){
		System.out.println("Audience go home");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("Audience take seats");
		System.out.println("audience switch off phone");
		
		//start stop watch
		try {
			jp.proceed();		//give control to pointcut method
		} catch (Throwable e) {
			System.out.println("Boo...audience demanding refund");
		}
		
		//stop the stop watch
		System.out.println("audinece applaud...CLAP CLAP");
		System.out.println("Audience go home");
	}
}
