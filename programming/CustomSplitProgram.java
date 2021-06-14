class CustomSplitProgram 
{
	public static void main(String[] args) 
	{
		String s = "hi hello how are you";
		String[] str  = customSplit(s);
		reverse(str);
	}

	public static String[] customSplit(String s)
	{
		char[] ch = s.toCharArray();
		int i = 0;
		int count = 0;
		String str = "";
		int j = 0;
		while (i < ch.length)
		{
			if (ch[i] == ' ')
			{
				count++;
			}
			i++;
		}

		String[] ss = new String[count + 1];

		for (char c : ch)
		{
			if (c != ' ')
			{
				str = str + c;
			}
			else
			{
				ss[j++] = str;
				str = "";
			}
		}
		ss[j] = str;
		return ss;
	}

	public static void reverse(String[] s)
	{
		String str = "";
		for (String ss : s)
		{
			for (int i = ss.length() - 1;i >=0 ;i-- )
			{
					str = str + ss.charAt(i);
			}
			str = str +" ";
		}
		
		System.out.println(str);
	}
}
