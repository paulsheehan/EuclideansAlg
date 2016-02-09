package mainCode;

public class EuclideanOperations {

	public int calculateGCD(int x, int y,int r)
	{
		int GCD = 0;
		
		int q = calculateQuotient(x, y);
		
		r = x-(y*q);
		
		if(r < 1)	//r is the remainder which is the base case
		{
			GCD = y;	//gcd is the last y in our alg because variables have not been shifted yet
			return GCD;	//return answer
		}
		else
		{
			x = y;	//shifting of variables
			y = r;	//moving onto next step in the alg
			return calculateGCD(x, y, r);	//function calls itself
		}
	}
	
	public int calculateQuotient(int x, int y)
	{
		double quotient = Math.floor(x/y); //round down number
		return (int)quotient;	//cast as an integer
	}
}
