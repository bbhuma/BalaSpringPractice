package com.Maven.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.Maven.demo")
@ComponentScan("TeacherApplication.class") // Either name of package or the Main class, location of main class is taken
											// into package name.
@PropertySource("classpath:application.properties")
public class SpringConfigApp {
	
	//Crete dependency of Teacher first, then pass the beanId into new math/chem Teacher()
	@Bean
	@Qualifier("motive")
	public QuoteService motivationalQuoteService() {
		return new MotivationalQuoteService();
	}
		
	@Bean("good")
	public QuoteService goodWordsQuoteService() {
		return new GoodWordsQuoteService();
	}
	
	@Bean
	@Qualifier("chemTeacher")
	public Teacher chemTeacher() {
		return new ChemistryTeacher(motivationalQuoteService()); //pass the bean id for dependencies
	}

	@Bean
	@Qualifier("mathTeacher")
	public Teacher mathTeacher() {
		return new MathTeacher(motivationalQuoteService()); //pass the bean id for dependencies
	}
	
	
}
