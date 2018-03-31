package com.caps.demo.spring.spell;

public class Data {
	
	public static String G = "6.67408 × 10-11 m3 kg-1 s-2";
	private String data;

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String showSometing() {
		return "Health is Wealth";
	}
}
