/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int sum=0;
		int rem=0;
		while(n>0)
		{
		  rem=n%10;
		// sum+=rem*10;
		  n=n/10;
          count++;
	}
	System.out.print(count);
}
}
