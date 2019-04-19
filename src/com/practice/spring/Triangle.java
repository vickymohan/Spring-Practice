package com.practice.spring;

import java.beans.ConstructorProperties;
import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

public class Triangle extends Shape /*implements ApplicationContextAware*/  {
	private String sides;
	private int angle;
	private String type;
	private List<Circle> c;
	private Circle cir;
	@Autowired
	private MessageSource message;
public Circle getCir() {
		return cir;
	}
@Resource(name="Circle2")
public void setCir(Circle cir) {
		this.cir = cir;
	}
public List<Circle> getC() {
		return c;
	}
@Autowired
	public void setC(List<Circle> c) {
		this.c = c;
	}
/*public Circle getC() {
		return c;
	}
	public void setC(Circle c) {
		this.c = c;
	}*/

public Triangle(String sides, String type) {
		super();
		this.sides = sides;
		this.type = type;
	}

public int getAngle() {
	return angle;
}
public void setAngle(int angle) {
	this.angle = angle;
	throw(new RuntimeException());
}

/*public Triangle(String sides, int angle) {
		super();
		this.sides = sides;
		this.angle = angle;
	}*/
public void draw(){
	System.out.println("Triangle Drawn");
	System.out.println("the side is "+ sides +" and the type is "+type );
	System.out.println("the angle is "+message.getMessage("angle",new Object[] {getAngle()}, "defaultAngle", null));
	System.out.println("circle object area "+cir.getArea()+" and diameter is "+cir.getDiameter());
	System.out.println(super.getName() +" & type is "+super.isIrregular() );
	for(Circle c1:c)
		System.out.println("the area is "+ c1.getArea()+" and the diameter is "+c1.getDiameter());
}
/*@Override
public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	// TODO Auto-generated method stub
	for(String str:ctx.getBeanDefinitionNames())
		System.out.println(str);
}
*/
}
