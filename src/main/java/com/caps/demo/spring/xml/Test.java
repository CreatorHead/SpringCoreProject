package com.caps.demo.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		Student s = null;
//		s.setName("Ryder");
//		s.setSub(new Physics());
//		
//		s.getSub().study();
//		
//		System.out.println("The Spring Way of Doing..");
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("/ConfigStudent.xml");
		
		s = ctx.getBean("student2",Student.class);
		s.getSub().study();
		ctx.close();
		
		
	}
}
