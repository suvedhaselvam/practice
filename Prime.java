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
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
