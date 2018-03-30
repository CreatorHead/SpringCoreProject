package com.caps.demo.spring.annotations;

public class Engine {
	private String type;
	private String model;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Engine [type=" + type + ", model=" + model + "]";
	}
}
