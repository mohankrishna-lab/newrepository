//Program to remove given char from given string

class ToRemoveCharString 
{
	public static void main(String[] args) 
	{
		String s = "programming";

		char remove = 'm';

		removeCharString(s , remove);
	}

	public static void removeCharString(String s , char remove)
	{
		char[] ch = s.toCharArray();

		String str = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			if (remove == ch[i])
			{
				ch[i] = '0';
			}
		}

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != '0')
			{
				str += ch[i];
			}	
		}

		System.out.println(str);
	}
}
