class GettersSetters 
{
	private int z;
	private int y;

	public GettersSetters()
	{
	}

	public GettersSetters(int z, int y)
	{
		this.z = z;
		this.y = y;
	}

	public void setz(int z)
	{
		this.z = z;
	}

	public void sety(int y)
	{
		this.y = y;
	}

	public int getz()
	{
		return z;
	}

	public int gety()
	{
		return y;
	}
}

class MainGettersSetters
{
	public static void main(String[] args) 
	{
		GettersSetters gs = new GettersSetters();
		
		gs.setz(35);
		gs.sety(56);
		GettersSetters gs1 = new GettersSetters(gs.getz(),gs.gety());
		

		System.out.println(gs.getz());
		System.out.println(gs.gety());
		
	}
}