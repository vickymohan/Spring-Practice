package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeDraw {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle tri = (Triangle) ctx.getBean("alias-triangle");
		tri.draw();
		tri.getCir().setArea(300);
		tri.setAngle(120);
		System.out.println(ctx.getMessage("greetings", null, "defaulgreeting", null));
	}

}
