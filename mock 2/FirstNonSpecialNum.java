class FirstNonSpecialNum 
{
	public static void main(String[] args) 
	{
		int num = 371;
		nonSpecial(num);
	}

	public static void nonSpecial(int num)
	{
		//for (int i = 0;i <= num ;i++ )
		//{
			if (isNonSpecial(num))
			{
				System.out.println(num);
				//break;
			}
		//}
	}

	public static boolean isNonSpecial(int num)
	{
		int temp = num;
		int lastDigit = num % 10;
		int sum = 0;

		while (num > 0)
		{
			int rem = num % 10;
			int d = rem * 10 + lastDigit;

			sum = sum + d;
			num /= 10;
		}
		
		System.out.println(sum);
		return temp == sum ?true:false;
	}
}