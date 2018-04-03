package com.caps.demo.spring.aop;


public class SingingPerformace implements Performance {
	@Override
	public void perform() {
		System.out.println("Start Singing...");
		int i = 2/0;
		System.out.println("Ends Singing...");
	}
}
