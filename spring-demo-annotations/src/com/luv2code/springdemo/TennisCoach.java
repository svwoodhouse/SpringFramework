package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Commenting out prototype scope due to @PreDestroy annotation does not work with a bean with the prototype scope
//@Scope("prototype")
public class TennisCoach implements Coach 
{
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService theFortune;
	
	// define a default constructor for setter injection
	public TennisCoach()
	{
		System.out.println("TennisCoach : inside default constructor");
	}
	
	// Define init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("TennisCoach: inside of doMyStartupStuff()");
	}
	
	// Define destroy method
	@PreDestroy
	public void doMyCleanupStuf()
	{
		System.out.println("TennisCoach: inside of doMyCleanupStuff()");
	}
	
	// Method Injection Example
	/*
	@Autowired
	public void FortuneServiceMethodInjection(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach : inside the FortuneServiceMethodInjection method");
		theFortune = theFortuneService;
	}
	*\
	
	// Define setter method
	//@Autowired
	/*public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach : inside the setFortuneService method");
		theFortune = theFortuneService;
	}
	*\

	/* used for constructor injection
	@Autowired
	public void TennisCoach(FortuneService fortune)
	{
		this.theFortune = fortune;
	}*/
	
	@Override
	public String getDailyWorkout()
	{
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() 
	{
		return theFortune.getFortune();
	}

}
