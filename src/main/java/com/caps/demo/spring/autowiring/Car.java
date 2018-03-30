package com.caps.demo.spring.autowiring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements BeanNameAware{
	private String name = "Maruti";
	
	@Autowired
	private Engine engine;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
	
	
}
