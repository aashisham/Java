Package GCES;
public class Student
{
	string name;
	int roll;

	public Student(int r,string n)
	{
		roll = r;
		name = n;

	}


	public void DisplayDetails()
	{
		Sytem.out.println("Name ="+name);
		Sytem.out.println("Roll = "+roll);

	}
}
