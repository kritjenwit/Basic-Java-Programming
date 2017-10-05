class AddOverload
{
	AddOverload()
	{
		System.out.println("**********Welcome to Overload Demo**********");
	}
	void add(int i,int j)
	{	
		System.out.println("The Sum of two integers is : "+(i+j));
	}
	void add(int i,double j)
	{	
		System.out.println("The Sum of one integer and one double value is : "+(i+j));
	}
	void add(double i,double j)
	{
		System.out.println("The Sum of two double values is :"+(i+j));
	}
}

class OverloadTest
{
	public static void main(String args[])
	{
		AddOverload obj=new AddOverload();
		obj.add(36,45);
		obj.add(34,54.67);
		obj.add(22.5,37.4);
	}
}
