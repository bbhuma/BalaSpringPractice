package com.Maven.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("good")
@Primary
public class GoodWordsQuoteService implements QuoteService {
	@Override
	public  String quote() {
		return "Practice makes man perfect";
	}
}