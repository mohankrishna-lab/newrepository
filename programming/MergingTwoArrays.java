class MergingTwoArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {10 , 12 , 7 , 34 , 86};

		int[] b ={84 , 55 , 96 , 22 , 8 ,11 , 100};

		int[] c = mergeArrays(a , b);
		
		for (int i = 0;i < c.length ;i++ )
		{
			System.out.println(c[i]);
		}
		
	}
	public static int[s] mergeArrays(int[] a , int[] b)
	{
		int[] c = new int[a.length + b.length];

		int i;

		for (i = 0;i < a.length;i++ )
		{
			c[i] = a[i];
		}

		for (int j = 0;i < c.length ;i++ , j++ )
		{
			c[i] = b[j];
		}

		return c;
	}
}
