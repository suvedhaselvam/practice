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
		Character ch=s.next().charAt(0);
		if(Character.isLetter(ch))
		{
			System.out.print("Alphabet");
		}
		else
		{
			System.out.print("No");
		}
	}
}
