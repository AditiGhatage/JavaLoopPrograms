package com.loopControls;

public class basicForLoop 
{
	// display message
	public void printForloop()
	{
	int intnumber = 5;
    // for loop  
    	for (int intindex = 1; intindex <= intnumber; ++intindex) 
    	{
    		System.out.println("Java is fun");
    	}
    	
    	System.out.println("----------------------------");
	}
	
	//print the sum of natural numbers from 1 to 1000
	public void additionOfNaturalNumbers()
	{
		int intsum = 0;
	    int intnatural = 1000;

	    // for loop
	    for (int intpointer = intnatural; intpointer >= 1; --intpointer) 
	    {
	      	intsum += intpointer;     // sum = sum + i
	    }
	       
	    System.out.println("Sum of 1000 natural numbers is:  = " + intsum);
	}
}