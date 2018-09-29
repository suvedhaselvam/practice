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
	 String str=s.nextLine();
	 char ch[]=str.toCharArray();
	 int count=0;
	 for(int i=0;i<ch.length;i++)
	 {
	 	if(Character.isLetter(ch[i]))
	 	{
	 		count++;
	 	}
	 }
	 if(count==ch.length)
	 {
	 	for(int i=0;i<ch.length;i++)
	 	{
	 		if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
	System.out.print("Vowel");
}	 		
else
{
	System.out.print("Consonant");
}
	 	}
	 }
	 else
	 {
	 	System.out.print("Invalid");
	 }
	 }
	}
