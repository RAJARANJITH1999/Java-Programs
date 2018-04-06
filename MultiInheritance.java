// Mutli level inheritance

class A
{
	int a;
	
	A(int x)
	{
		a=x;
	}
	
	void showa()
	{
		
		System.out.println(" a="+a);
		
	}
}

//class B will inherit the members of class A

class B extends A
{
	int b;
	
	B(int x,int y)
	{
		super(x);
		b=y;
	}
	
	void showb()
	{
		
		System.out.println(" b="+b);
		
	}
}

//class C will inherit the memebers of class B

class C extends B
{
	int c;
	
	C(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}	
	
	void showc()
	{
		
		System.out.println(" c="+c);
	}
	
	void sum()
	{
		System.out.println("sum of a,b,c="+(a+b+c));	
		
	}	
}

// Main class 

class MultiInheritance
{

	public static void main(String args[])
	{
		A superob=new A(10);
		B interob=new B(10,20);
		C subob=new C(1,2,3);
	
		// giving value to the variable a in the super class
		
		System.out.println("content of superclass:");
		superob.showa();
	
		// the subclass has acess to all the public memeber of its superclass
		
		System.out.println("content of Intermediate class B: ");
		interob.showa();
		interob.showb();
	
		// the subclass has acess to all the public memeber of its superclass
		
		System.out.println("contents of SUbclass C:");
		subob.showa();
		subob.showb();
		subob.showc();
	
		// calculating the sum by using sum()
	
		subob.sum();
	}
}
	
