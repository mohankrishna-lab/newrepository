class ArrayObjectProof 
{
	public static void main(String[] args) 
	{
		ArrayObjectProof p = new ArrayObjectProof();

		p.start();
	}

	public void start()
	{
		int[] a1 = {3,4,5};
		int[] a2 = fix(a1);

		System.out.print(a1[0] + a1[1] + a1[2] + " ");
		System.out.print(a2[0] + a2[1] + a2[2]);
	}

	int [] fix(int [] a3)
	{
		a3[1] = 7;

			return a3;
	}
}
