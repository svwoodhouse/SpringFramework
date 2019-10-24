package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService 
{
	// Array of fortune
	private String[] data = {"Hello I am fortune 1.", "Hello I am fortune 2.","Hello I am fortune 3."};
	
	public String getFortune()
	{
		// Pick a random fortune from the fortune array
		Random rand = new Random();
		return data[rand.nextInt(data.length)];
	}

}
