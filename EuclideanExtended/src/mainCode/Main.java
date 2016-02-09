package mainCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] argv)
	{
		int err, x, y;	//pre-declared because the scan assignment is in a try block
		err=x=y=0;
		
		try
		{
			System.out.println("Enter two numbers");
			
			Scanner scn = new Scanner(System.in);
			x = scn.nextInt();	//Receive x
			y = scn.nextInt();	//Receive y
			scn.close(); //close scanner to avoid memory leak
		}
		catch(InputMismatchException exception)	//Catch if non-integer was input
		{
		  System.out.println("This is not an integer");
		  err++;
		}
		
		if(err < 1)	//if no exception was caught
		{
			EuclideanOperations euch = new EuclideanOperations();
			System.out.println(euch.calculateGCD(x, y, 0));	//call the recursive Euclidean algorithm once
		}
	}
}
