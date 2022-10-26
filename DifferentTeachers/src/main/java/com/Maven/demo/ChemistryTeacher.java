package com.Maven.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chemTeacher")
public class ChemistryTeacher implements Teacher {
	
	@Autowired
	@Qualifier("good")
	private QuoteService quoteService;
	
	public ChemistryTeacher(QuoteService motivationalQuoteService) {
		
	}
	@Override
    public String getDailyHomework() {
		return "Have you done your chemistry homework?";
		
	}
	@Override
	public String getDailyQuote() {
		return quoteService.quote();
	}
}