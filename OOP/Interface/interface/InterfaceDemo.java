class InterfaceDemo
{
	public static void main(String[] args) 
	{
		Shape shape ;
		shape = new Circle();
		shape.area();
		shape.init();
		shape = new Rectangle();
		shape.area();
	

		Circle c = new Circle();
		c.area();
		Rectangle r = new Rectangle();
		r.area();
		
	}
}
