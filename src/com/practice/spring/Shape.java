package com.practice.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Shape /*implements BeanFactoryPostProcessor*/{
private String name;
private boolean irregular;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isIrregular() {
	return irregular;
}
public void setIrregular(boolean irregular) {
	this.irregular = irregular;
}
/*@Override
public void postProcessBeanFactory(ConfigurableListableBeanFactory beanfactory) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("Bean factory is initialized");
}*/
}
