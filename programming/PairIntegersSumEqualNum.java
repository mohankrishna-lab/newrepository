class PairIntegersSumEqualNum 
{
	public static void main(String[] args) 
	{
		int[] a = {9,5,6,7,4,2,3,1,4,65,4,5,7,6};

		int num = 11;

		System.out.println("the combination that gives sum as " + num + " is:");

		printPairNumEqualSum(a,num);
	}

	public static void printPairNumEqualSum(int[]  a,int num)
	{
		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = 0;j < a.length ;j++ )
			{
				if ((a[i] + a[j]) == num)
				{
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}
}
