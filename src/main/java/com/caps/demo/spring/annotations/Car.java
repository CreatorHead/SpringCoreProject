package com.caps.demo.spring.annotations;

public class Car {
	private String name;
	private String color;
	private Double price;
	private Engine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
}
