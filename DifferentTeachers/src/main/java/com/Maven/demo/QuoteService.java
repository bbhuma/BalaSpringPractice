package com.Maven.demo;

import org.springframework.stereotype.Component;

@Component
public interface QuoteService {
	public  String quote();  // Interface method can not be static, if you declare method with static it becomes abstract method. 
}