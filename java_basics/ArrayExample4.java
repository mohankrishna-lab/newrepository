import java.util.Scanner;
class ArrayExample4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("enter size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter a number");
		for (i=0;i<a.length ;i++ )
		{
			a[i]=sc.nextInt();
			
		}
		for (i=0;i<a.length ;i++ )
		{
			checkPrimeNumber(a[i]);
		}
		
			
     }
		public static void checkPrimeNumber(int a)
		{
			int count=0;
			for (int i=1;i<=a;i++ )
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(a+" is a prime number");
			}
			else
			{
				System.out.println(a+" is not a prime number");
			}
			
		 }
		


		
	
}
