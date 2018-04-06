import java.util.Scanner;
abstract class Area
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	abstract void input();
	abstract void area();
}
class Triangle extends Area
{
	void input()
	{
		System.out.println("enter the dimensions of traingle");
	
		System.out.println("enter a value");
		a=sc.nextInt();

		System.out.println("enter b value");
		b=sc.nextInt();

	}

	void area()
	{
		System.out.println("The area of triangle is "+(a*b/2));
	}
}
class Rectangle extends Area
{
	
	void input()
	{
		System.out.println("enter the dimensions of rectangle");
	
		System.out.println("enter a value");
		a=sc.nextInt();

		System.out.println("enter b value");
		b=sc.nextInt();

	}

	void area()
	{
		System.out.println("The area of rectangle is "+(a*b));
	}
}
class Circle extends Area
{

	void input()
	{
		System.out.println("enter the dimensions of circle");
	
		System.out.println("enter radius value");
		a=sc.nextInt();
	}
	void area()
	{
		System.out.println("The area of rectangle is "+(3.14*a*a));
	}
}

class AbstractClass
{
	public static void main(String ar[])
	{
		Triangle t=new Triangle();
		t.input();
		t.area();
		Rectangle r=new Rectangle();
		r.input();
		r.area();
		Circle c=new Circle();
		c.input();
		c.area();
	}
}

