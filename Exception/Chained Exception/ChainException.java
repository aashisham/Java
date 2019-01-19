class ChainException
{
	static void demoproc()
	{
		NullPointerException e = new NullPointerException ("top layer");
		e.initCause(new ArithmeticException ("cause"));
		throws e;
	}
}

public static void main(String[] args) 
{
	try
	{
		demoproc();
	}
	catch(NullPointerException e)
	{
		System.out.println("caught"+e);
		System.out.println("original case:"+e.getCause());
	}

	
}
