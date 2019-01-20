class ThrowsDemo
{
	 //no object reference because of static
	static void throwOne() throws IllegalAccessException 
	{
		System.out.println("inside throwOne"); 
		// throw new ArithmeticException("this is ArithmeticException"); //this is a run time exception so it has default handler so no need of catch
		throw new IllegalAccessException("this is IllegalAccessException");  //this is not run time so we need to create handler banaunai parxa i.e create catch so to remove this error use throws
	

	}
	public static void main(String[] args) 
	{
		try
		{
			throwOne(); //we need to bind this calling method in rule
		}
		catch(IllegalAccessException e)
		{
			System.out.println("this is a IllegalAccessException");
		}
	}

}
