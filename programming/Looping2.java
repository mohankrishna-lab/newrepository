class Looping2 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5;i++ )
		{
			for (int j=10;j<=15 ; j++)
			{
				if (i%2==0)
				{
					System.out.println(i+ " "+ j);
				}

				
				
			}
			if(i%2!=0)
			System.out.println(i);
			
		}
		
	}
}
