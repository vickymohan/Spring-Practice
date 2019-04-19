package com.practice.spring;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectPractice {
/*	@Before("execution(public int com.practice.spring.Circle.getArea())")
	public void beforeAspect(){
		System.out.println("before method is called");
	}
	@AfterReturning("args(area)")
	public void aspectAdvice(JoinPoint join,int area){
		System.out.println("Advice ran After setter method execution");
		System.out.println(join.toString()+" && "+area);
	}
	@AfterThrowing(pointcut="args(angle)",throwing="ex")
	public void aspectAdvice2(JoinPoint join, int angle, Exception ex){
		System.out.println("Advice ran After setter method Threw Exception");
		System.out.println(join.toString() +" && "+ angle);
		ex.printStackTrace();
	}*/
	@Pointcut("execution(public * get*())")
	public void pointcutsample(){}
	
	@Pointcut("execution(public int com.practice.spring.Circle.getDiameter())")
	public void pointcutsample2(){}
	
	@Pointcut("args(int)")
	public void argspointcut(){}
	
	@Around("args(area)")
	public void aroundAdvice(ProceedingJoinPoint p,int area){
		
		try {
			System.out.println("before proceed method");
			p.proceed();
			System.out.println(p.toString());
			System.out.println("after proceed method");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("after thrown & inside catch block");
			System.out.println(p.toString());
			e.printStackTrace();
		}
		System.out.println("finally executed"+area);
	}
}
