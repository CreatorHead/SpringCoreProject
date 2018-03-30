package com.caps.demo.spring.annotations;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware{
	private String name;
	private Subject sub;
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
		System.out.println("Bean Name: "+ name);
	}
}
