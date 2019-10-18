package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp 
{
	public static void main(String[] args) 
	{
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring Container
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}
