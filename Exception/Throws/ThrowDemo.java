class ThrowDemo
{
	public static void main(String[] args)
	{
		// int a = 5;
		// int c= a/0;
		System.out.println("Example of throw keyword");

		try
		{
			throw new ArithmeticException("Divide by 0 explicitly");  //this acts like a parameterized constructor and the message is sent as parameter which is given explictly
		}
		catch(ArithmeticException e) //e is reference variable
		{
			System.out.println("this is a error"+e);
			System.out.println("getMessage = "+e.getMessage()); //getMessage() gives message inside the ArithmeticException method 

		}
		System.out.println("ending");

	}
}
