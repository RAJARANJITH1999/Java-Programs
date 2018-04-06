import java.util.Scanner;
class Constructor
{
	int a;
	int b;
	int c;

	//default constructior

	Constructor()
	{
		a=b=c=0;
	}


	//parametarized constructor
	Constructor(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}


	// add function
	void add()
	{

		System.out.println("addition of 3 number is="+(a+b+c));
	}

	public static void main(String a[])
	{
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a");
		x=s.nextInt();
		System.out.println("enter the value of y");
		y=s.nextInt();
		System.out.println("enter the value of z");
		z=s.nextInt();
		Constructor c=new Constructor(x,y,z);
		Constructor c1=new Constructor();

		c.add();	
		c1.add();			
			
	}
}
