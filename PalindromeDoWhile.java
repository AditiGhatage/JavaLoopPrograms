package com.loopControls;

public class PalindromeDoWhile 
{
	public void palindrome()
	{
		int intrandom, sum=0, temp;
		int intnum=344;
		
		temp = intnum;
		while(intnum>0)
		{
			intrandom=intnum%10;
			sum=(sum*10)+intrandom;
			intnum=intnum/10;
		}
		if(temp==sum)
		{
			System.out.println("Given number is a Palindrome. ");
		}
		else
		{
			System.out.println("Given number is not a Palindrome.");
		}
	}
}
