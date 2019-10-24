package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService
{
	private String randomFortunes[] = {"This is a good fortune. You have good luck",
			"This is a okay fortune. Your day will be average.",
			"This is a bad fortune. You have bad luck yo"};

	@Override
	public String getFortune() 
	{
		Random rand = new Random();
		return randomFortunes[rand.nextInt(3)];
	}

}
