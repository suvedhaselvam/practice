
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
	 String str=s.nextLine();
	 char ch[]=str.toCharArray();
	 int count=0;
	 for(int i=0;i<ch.length;i++)
	 {
	 	if(Character.isDigit(ch[i]))
	 	{
	 		count++;
	 	}
	 }
	 if(count==ch.length)
	 {
	 	int a=Integer.parseInt(str);
	 if(a%2==0)
	 {
	 	System.out.print("Even");
	 }
	 else
	 {
	 	System.out.print("Odd");
	 }
	 	}
	 else
	 {
	 	System.out.print("Invalid");
	 }
	 }
	}
