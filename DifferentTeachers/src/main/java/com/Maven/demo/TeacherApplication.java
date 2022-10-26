package com.Maven.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeacherApplication {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigApp.class);
		
		Teacher drawingTeacher = ac.getBean("chemTeacher", Teacher.class);
		System.out.println(drawingTeacher.getDailyHomework());
		System.out.println(drawingTeacher.getDailyQuote());
		
		Teacher mathTeacher = ac.getBean("mathTeacher", Teacher.class);
		System.out.println(mathTeacher.getDailyHomework());
		System.out.println(mathTeacher.getDailyQuote());
	}

}
