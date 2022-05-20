package com.loopControls;

public class DisplayNumberUsingWhile 
{
	public void displayNum() //DisplayingNumbersFrom1To10
	{
	int intInteger = 1;
	int intNumber = 10;

	//while loop from 1 to 10
	while(intInteger <= intNumber)
	{
	System.out.println(intInteger);
	intInteger++;
	}
	}

	public void displaySequence() //DisplayNumberSequenceAndEliminate4
	{
	int intSum = 0;
	while(intSum<10)
	{
	if(intSum == 4)
	{
	intSum++;
	continue;
	}
	System.out.println(intSum);
	intSum++;
	}
	}

}
