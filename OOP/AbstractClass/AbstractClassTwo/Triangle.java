class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a,b);
	}

	double area()
	{
		System.out.println("Inside Triangle");
		return dim1*dim2/2;
	}
}
