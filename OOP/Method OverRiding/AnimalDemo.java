class Animal 
{

	void eat()
	{
		System.out.println("Animal eats grass");
	}
}

class Human extends Animal 
{
	void eat()
	{
		System.out.println("Human eats food"); // this is method overriding
	}
}


class AnimalDemo 
{
	public static void main(String[] args) {
		
		Human H = new Human ();
		H.eat();
	}
}
