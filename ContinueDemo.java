package com.loopControls;

public class ContinueDemo 
{
	public void displayNumbers()
	{
		//First Label
		first:
	        for (int intnum = 0; intnum < 3; intnum++) 
	        {
	        // Second Label
	        
	            for (int demo = 0; demo < 3; demo++) 
	            {
	                if (intnum == 1 && demo == 1) {
	 
	                    // Using continue statement with Label
	                    continue first;
	                }
	                System.out.println(intnum + " " + demo);
	            }
	        }
		System.out.println("===================");
		System.out.println('\n');
	}
	

	
	public void breakloop()
	{
		for (int count = 0; count < 10; count++) {
            // Terminate the loop when i is 5
            if (count == 5)
                break;
            System.out.println("count is: " + count);
        }
        System.out.println("Out of Loop");
	}
}