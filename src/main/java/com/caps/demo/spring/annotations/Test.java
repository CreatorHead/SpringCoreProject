package com.caps.demo.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		Student s = null;
//		s.setName("Ryder");
//		s.setSub(new Physics());
//		
//		s.getSub().study();
//		
//		System.out.println("The Spring Way of Doing..");
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ConfigStudent.class);
		s = ctx.getBean("student",Student.class);
		System.out.println(s);
		
	}
}
