import java.util.Scanner;
class ArrayExample5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of strings");
		int size=sc.nextInt();
		String s1[]=new String[size];
		System.out.println("enter string values");
		for (int i=0;i<s1.length ;i++ )
		{
			s1[i]=sc.next();
		}
		for (int i=0;i<s1.length ;i++ )
		{
			checkStringPalindrome(s1[i]);
		}
	}
		public static void checkStringPalindrome(String s1)
		{
			String s2="";
			for(int i=s1.length()-1;i>=0;i--) 
			{
			s2=s2+s1.charAt(i);
			}
			if(s1.equals(s2))
			{
				System.out.println(s1+" is a palindrome");
			}
			else
			{
				System.out.println(s1+" is not a palindrome");
			}
		}
		
		

		
	
}
