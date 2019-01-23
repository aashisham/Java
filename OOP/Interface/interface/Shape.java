interface Shape 
{
	double length=0; //interface le class variable default final linchha , final na lekhe ni hunchha
	abstract public void area(); //abstract nalekhe ni hunchha since interface ko method aafai abastract hunchha(if method ma body chhaina vani)
	// {
	// 	System.out.println("area");
	// }

	default void init()
	{
		System.out.println("init shape");
	}




}
