class A
{
 	private int a;
	
	A(int x)
	{
		a=x;
		
		System.out.println("value of a="+a);
	}
	
	
}

class B extends A
{

	int b;
	B(int x,int y)
	{
		super(x);
		b=y;
		
		System.out.println("value of b="+b);
	}
	
	
}

class SuperClass
{
	public static void main(String args[])
	{
	
		// creating superclass object
		System.out.println("Superclass Members");
		A b=new A(12);
		
		//Creating subclass object 
		System.out.println("Subclass members");
		B b1=new B(1,2);
	}
}
