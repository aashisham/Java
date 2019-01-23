class Person
{
	static int count;
	int totalCount()
	{
		return count;
	}
	void enterToTheRoom()
	{
		// System.out.println("entering");

		count++;

	}
	
}

class PersonDemo
{
	public static void main(String[] args) {
		Person obj = new Person();
		obj.enterToTheRoom();
		obj.enterToTheRoom();

		Person obj2 = new Person();
		obj2.enterToTheRoom();
		
		System.out.println(Person.count);  // System.out.println(obj2.totalCount());
	

	}
}
