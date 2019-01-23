
class Rectangle extends Figure 
{
	Rectangle (double a , double b) //this calls constructor of super class
	{
		super(a,b);
	}
	
	double area()
	{
		System.out.println("Inside the Rectangle");
		return dim1 * dim2 ;
	}
}

