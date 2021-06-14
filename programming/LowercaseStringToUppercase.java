class LowercaseStringToUppercase
{
	public static void main(String[] args) 
	{
		String s = "helloworld";

		System.out.println(toUppercaseString(s));
	}
	
	public static String toUppercaseString(String s)
	{
		char[] ch = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				ch[i] = (char)(ch[i] - 32);
			}
		}
		return new String(ch);
	}
}
