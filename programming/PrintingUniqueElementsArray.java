class PrintingUniqueElementsArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5,7,8,9,10,5,6};

		printUniqueEleArray(a);
	}
	
	public static void printUniqueEleArray(int[] a)
	{
		boolean flag = true;

		for (int i = 0;i < a.length ;i++ )
		{
			int count = 0;
			int temp = a[i];

			for (int j = 0;j < a.length ;j++ )
			{
				if (a[j] == temp)
				{
					count++;
				}
			}

			if (count == 1)
			{
				System.out.println(temp);
			}
		}
	}
}
