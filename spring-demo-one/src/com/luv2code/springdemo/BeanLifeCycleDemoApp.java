package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) 
	{
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve the bean from the Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check to see if the two beans are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object " + result);
		System.out.println("\nMemory locaion for theCoach: " + theCoach);
		System.out.println("\nMemory locaion for alphaCoach: " + alphaCoach);	
		
		// Close the configuration file
		context.close();
		
	}

}
