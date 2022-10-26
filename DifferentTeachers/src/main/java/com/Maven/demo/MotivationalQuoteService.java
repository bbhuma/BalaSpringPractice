package com.Maven.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("motive")
@Primary
public class MotivationalQuoteService implements QuoteService {
	@Override
	public  String quote() {
		return "Do or Die with Programming";
	}
}