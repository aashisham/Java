interface Graphics
{
	void draw();

	default void init()
	{
		System.out.println("init graphics");
	}
}
