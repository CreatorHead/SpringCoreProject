package com.caps.demo.spring.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LaptopConfig {
	
	@Bean(name="laptop")
	@Scope("prototype")
	public Laptop getLaptop() {
		Laptop l = new Laptop();
		l.setModel("Z70");
		l.setName("Lenovo");
		return l;
	}
}
