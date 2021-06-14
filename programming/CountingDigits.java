// Counting Digits In A Given Number

import java.util.Scanner;

class CountingDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		countDigits(num);
	}
	public static void countDigits(int num)
	{
		if (num==0)
		{
			System.out.println("total digits:" + 1);
		}
		else
		{
			int count=0;
			while(num > 0)
			{
				count++;
				num /= 10;
			}
			System.out.println("total digits:" + count);
		}
	}
}
