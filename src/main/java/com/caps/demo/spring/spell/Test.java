package com.caps.demo.spring.spell;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/SpellConfig.xml");
		
		ShowData sd = ctx.getBean("showBean",ShowData.class);
		System.out.println(sd.getData());
		ctx.close();
	}
}
