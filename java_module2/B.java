class Demo1 
{
	int x=10;
	public void m1() 
	{
		System.out.println("Hello");
	}
}
class Demo2
{
	int y=20;
	public void m2()
	{
		System.out.println("world");
	}
}
class B
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.x);
		d1.m1();
		Demo2 d2=new Demo2();
		System.out.println(d2.y);
		d2.m2();
	}
}
