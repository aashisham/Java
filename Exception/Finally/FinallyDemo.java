
class FinallyDemo
{

	static void finallyOne()
	{
		int b = 1,a;        //check by placing 0 in the value of b
		try
		{
			System.out.println("inside try");
			a = 2/b;
			return;
		   
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch");

		}
		
		finally              // this will execute only if try block return
		{
			System.out.println("good bye");
		}
	}
	public static void main(String[] args) 
	{
		finallyOne();
		
	}
}
