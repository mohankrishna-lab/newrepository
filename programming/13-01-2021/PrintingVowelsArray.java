//Program to print all the vowels from a given array of characters

class PrintingVowelsArray
{
	public static void main(String[] args) 
	{
		char[] ch = {'m' , 'M' , 'A' , 'a' , 'O' , 'p' , 'i' , 'E'}; 
		printVowels(ch);
	}

	public static void printVowels(char[] ch)
	{
		for (char c : ch)
		{
			if (isVowel(c))
			{
				System.out.println(c);
			}
		}

	}

	public static boolean isVowel(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
