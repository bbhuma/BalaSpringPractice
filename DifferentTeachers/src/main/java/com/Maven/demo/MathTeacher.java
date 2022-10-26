package com.Maven.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mathTeacher")
public class MathTeacher implements Teacher {

	@Autowired
	@Qualifier("motive")
	private QuoteService quoteService;

	public MathTeacher(QuoteService motivationalQuoteService) {

	}

	@Override
	public String getDailyHomework() {
		return "Have you done your math homework?";
	}

	@Override
	public String getDailyQuote() {
		return quoteService.quote();
	}
}