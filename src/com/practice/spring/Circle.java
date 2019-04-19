package com.practice.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

public class Circle  /*implements InitializingBean,DisposableBean*/ {
private int area;
public int getArea() {
	return area;
}
public void setArea(int area) {
	this.area = area;
}
private int diameter;

public int getDiameter() {
	return diameter;
}
public void setDiameter(int diameter) {
	this.diameter = diameter;
}
/*@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroy Method Called");
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("the bean is initialized");
	
}*/
public void initialize(){
	System.out.println("Circle bean initialized");
}

public void dispose(){
	System.out.println("Bean is disposed");
}
}
