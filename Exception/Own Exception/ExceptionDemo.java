class ExceptionDemo
{
	static void compute(int a) throws MyException
	{
		if(a>10)
		{
			throw new MyException(a);
		}

	}
	public static void main(String[] args) {
		try
		{
			compute(1);
			compute(20);
		}
		catch (MyException e)
		{
			System.out.println("caught"+e.toString());
		}
	}
}
