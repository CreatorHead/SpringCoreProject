package com.caps.demo.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public Audiance audiance() {
		return new Audiance();
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
	
	@Bean(name="singing")
	public Performance performance() {
		return new SingingPerformace();
	}
	
	@Bean
	public BlankDisc getDisc() {
		return new BlankDisc();
	}
	
}
