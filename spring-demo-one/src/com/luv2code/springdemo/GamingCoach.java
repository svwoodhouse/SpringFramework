package com.luv2code.springdemo;

public class GamingCoach implements Coach
{
	public RandomFortuneService fortune;
	
	public GamingCoach(RandomFortuneService myFortune)
	{
		this.fortune = myFortune;
	}
	
@Override
	public String getDailyWorkout() 
	{
		return("Play Overwatch for 4 hours!");
	}

@Override
public String getDailyFortune() 
{
	return fortune.getFortune();
}

}
