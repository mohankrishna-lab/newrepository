class MainBikes
{
	public static void main(String[] args) 
	{

		Bike.printStatement();

		Bike b1 = new Bike("tvs" , 99.99, "red" , 1998, 78);
		b1.display();

		Bike b2 = new Bike("honda" , 89.99, "blue" , 1996, 78);
		b2.display();

		Bike b3 = new Bike("bullet" , 77.59, "silver", 1992 , 78);
		b3.display();

		Bike b4 = new Bike("apache" , 69.99, "orange" ,1990, 78);
		b4.display();

		Bike b5 = new Bike("bajaj" , 49.99, "black",1998 , 78);
		b5.display();

		Bike b6 = new Bike("tvs xl" , 76.99, "brown", 1997 , 78);
		b6.display();

		Bike b7 = new Bike("heavy" , 43.99, "yellow" , 1992 , 78);
		b7.display();

		Bike b8 = new Bike("hero" , 56.99, "pink" , 1995, 78);
		b8.display();
	
		Bike b9 = new Bike("r15" , 77.99, "blush", 1994 , 78);
		b9.display();

		Bike b10 = new Bike("splend" , 66.66, "green" , 1996 , 78);
		b10.display();


	}
}

class Bike
{
	String name;
	Double price;
	String color;
	int yOM;
	int milage;

	Bike(String name , Double price , String color , int yOM , int milage)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.yOM = yOM;
		this.milage = milage;
	}

	public void display()
	{
		System.out.print(this.name);
		System.out.print("\t\t" + this.price);
		System.out.print("\t\t" + this.color);
		System.out.print("\t\t" + this.yOM);
		System.out.println("\t\t" + this.milage);
	}

	public static void printStatement()
	{
		System.out.println("name\t\tprice\t\tcolor\t\tyOM\t\tmilage");
		System.out.println("----------------------------------------------------------------------");
	}
}
