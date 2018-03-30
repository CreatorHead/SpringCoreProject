package com.caps.demo.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig
{
	@Bean(name="car")
	public Car getcar()
	{
		Car c=new Car();
		c.setName("audi");
		c.setColor("white");
		c.setPrice(100000000.00);
		c.setEngine(getEngine());
		return c;
	}
	
	@Bean(name="engine")
	public Engine getEngine() {
		Engine e = new Engine();
		e.setType("xyz");
		e.setModel("abc");
		return e;
	}
	
}
