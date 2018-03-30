package com.caps.demo.spring.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanNameAware, BeanFactoryAware
		,ApplicationContextAware, BeanPostProcessor,DisposableBean {
	private String name;
	private Subject sub;
	
	public Student() {
		
	}
	
	public Student(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sub=" + sub + "]";
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("BeanName: "+name);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Factory: "+beanFactory);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context Type: "+applicationContext.getDisplayName());
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before inti of props with the Bean: "+beanName);
		return null;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After inti of props with the Bean: "+beanName);
		return null;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("The bean is being destroyed...");
	}
}
