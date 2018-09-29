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
		String str1=s.nextLine();
		String str2=s.nextLine();
		String str3=s.nextLine();
		try
		{
			int n1=Integer.parseInt(str1);
			int n2=Integer.parseInt(str2);
			int n3=Integer.parseInt(str3);
		if(n1>n2&&n1>n3)
		{
			System.out.print(n1);
		}
		else if(n2>n3&&n2>n1)
		{
			System.out.print(n2);
		}
		else
		{
		     System.out.print(n3);	
		}
		}
		catch(NumberFormatException x)
		{
		 System.out.print("Invalid");
		}
		}
	}
	
