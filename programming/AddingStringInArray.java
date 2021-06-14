//Program to add specific string at the specified index in a given array of String

class AddingStringInArray
{
	public static void main(String[] args) 
	{
		String[] s1 = {"hello " , "world" , "are" , "you" , "ok" , "in" , "world"};

		int pos = 4;

		String ele = "newton";

		String[] s2 = addStringArray(s1 , pos , ele);

		for (int i = 0;i < s2.length ;i++ )
		{
			System.out.println(s2[i]);
		}
	}

	public static String[] addStringArray(String[] s1 , int pos , String ele)
	{
		String[] s2 = new String[s1.length + 1];

		int i;
		for (i = 0;i < pos ;i++ )
		{
			s2[i] = s1 [i];
		}
		s2[i] = ele;

		for (;i < s1.length ;i++ )
		{
			s2[i + 1] = s1[i];
		}
		return s2;
	}
}
