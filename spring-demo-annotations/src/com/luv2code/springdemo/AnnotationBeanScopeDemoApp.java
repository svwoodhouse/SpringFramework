package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp
{
	public static void main(String[] args) 
	{
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Creates two instances of the tennisCoach class. Retrieves the beans from the Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Checks to see if the beans are located in the same memory location
		boolean check = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same oobject in memory: " + check);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		// Close the context
		context.close();
	}

}
