class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
	//	char ch[]=str.toCharArray();
		try
		{
			int n=Integer.parseInt(str);
			int a=str.length();
		System.out.print(a);
	}
	catch(NumberFormatException nd)
	{
		System.out.print("Invalid");
	}
}
}
