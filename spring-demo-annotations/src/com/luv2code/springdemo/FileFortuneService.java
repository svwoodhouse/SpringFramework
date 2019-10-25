package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService
{
	private List<String> fileFortunes;
	private String file = "fortunes.txt";
	private BufferedReader bf;
	private String[] fortuneArray;
	
	@Override
	public String getFortune() 
	{
		try {
			bf = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fileFortunes = new ArrayList<String>();
		String line;
		try {
			while((line = bf.readLine()) != null)
			{
				fileFortunes.add(line);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fortuneArray = fileFortunes.toArray(new String[] {});
		
		Random ran = new Random();
		return fortuneArray[ran.nextInt(fortuneArray.length)];
	}

}
