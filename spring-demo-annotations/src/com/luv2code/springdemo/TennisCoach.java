package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
