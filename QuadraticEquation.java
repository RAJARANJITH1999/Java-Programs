import java.util.Scanner;

class QuadraticEquation
{
	public static void main(String args[])
	{
		int a,b,c;
		double d,r1,r2;
		Scanner s=new Scanner(System.in);

		//reading the value a 
		System.out.println("enter the a value");
		a=s.nextInt();		

		//reading the value b		
		System.out.println("enter the b value");
		b=s.nextInt();

		//reading the value c
		System.out.println("enter the c value");
		c=s.nextInt();
	

		// calculating the roots
		r1=-b+(Math.sqrt(b*b-(4*a*c)))/2*a;
		r2=-b-(Math.sqrt(b*b-(4*a*c)))/2*a;

		System.out.println("root r1="+r1+"  "+"roots r2 ="+r2);


		//calculating the discrement value
		d= b*b-(4*a*c);
		System.out.println("discremenet value of d="+d);

		
		// checking the discrement value using conditional statments of their repective natures

		if(d>0)
		{
			System.out.println("------------------------------------------");
			System.out.println("Roots are real and unequal");
			System.out.println("------------------------------------------");
		}
		else if(d==0)
		{
			System.out.println("------------------------------------------");
			System.out.println("Roots are real and equal");
			System.out.println("------------------------------------------");
		}
		else
		{
			System.out.println("------------------------------------------");
			System.out.println("Roots are imaginary");	
			System.out.println("------------------------------------------");
		
		}									
	}
}

