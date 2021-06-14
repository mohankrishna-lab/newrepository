//Program to display String starts with a 's' or 'S'

import java.util.Scanner;

class DisplayingStringWithS 
{
	public static void main(String[] args) 
	{
		String[] s = readArray();
		
		disStringWithS(s);

	}

	public static String[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		System.out.println("enter elements into an array");

		String[] a = new String[size];
		for (int i = 0;i < a.length ;i++ )
		{
			a[i] = sc.next();
 		}
		return a;
	}

	public static void disStringWithS(String[] s)
	{

		System.out.println("the words stats with char s or S is : ");
		for (String str : s)
		{
			if (str.charAt(0) == 's' || str.charAt(0) == 'S')
			{
				System.out.println(str);
			}
		}
	}
}
