class MainOfActors 
{
	public static void main(String[] args) 
	{
		Actors a1 = new Actors("Keanue Reeves" , 54 , 26);
		Actors a2 = new Actors("Tom Hanks" , 58 , 36);
		Actors a3 = new Actors("Bryan Cranton" , 57 , 10);
		Actors a4 = new Actors("Chris Hemsworth" , 36 , 11);

		System.out.println("actor name:" + a1.name);
		System.out.println("age:" + a1.age);
		System.out.println("numbers of movies:" + a1.noOfMovies);
		System.out.println("-----------------------");

		System.out.println("actor name:" + a2.name);
		System.out.println("age:" + a2.age);
		System.out.println("number of movies:" + a2.noOfMovies);
		System.out.println("-----------------------");

		System.out.println("actor name:" + a3.name);
		System.out.println("age:" + a3.age);
		System.out.println("number of movies:" + a3.noOfMovies);
		System.out.println("-----------------------");

		System.out.println("actor name:" + a4.name);
		System.out.println("age:" + a4.age);
		System.out.println("number of movies:" + a4.noOfMovies);
		System.out.println("-----------------------");

	}
}

class Actors
{
	String name;
	int age;
	int noOfMovies;

	public Actors(String a , int b , int c)
	{
		name = a;
		age = b;
		noOfMovies = c;
	}
}
