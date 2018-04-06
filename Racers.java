import java.util.Scanner;

class Racers
{
	public static void main(String args[])
	{
		double r1,r2,r3,r4,r5,avg;
		int constant=50;
		int i,check;

		Scanner s=new Scanner(System.in);

		//reading the racers speed
		
		System.out.println("enter the speed of racer 1");
		r1=s.nextDouble();

		System.out.println("enter the speed of racer 2");
		r2=s.nextDouble();

		System.out.println("enter the speed of racer 3");
		r3=s.nextDouble();	

		System.out.println("enter the speed of racer 4");
		r4=s.nextDouble();		

		System.out.println("enter the speed of racer 5");
		r5=s.nextDouble();

		//calculating the all racers avg speed

		avg=(r1+r2+r3+r4+r5)/5;

		if(r1>avg)
		{
			System.out.println("------------------------------------------");
			System.out.println("the speed of racer r1 "+ r1+" can qualify ");
			System.out.println("------------------------------------------");
		}
		if(r2>avg)
		{		
			System.out.println("------------------------------------------");
			System.out.println("the speed of racer r2 "+ r2+" can qualify ");
			System.out.println("------------------------------------------");
		}
		if(r3>avg)
		{
			System.out.println("------------------------------------------");
			System.out.println("the speed of racer r3 "+ r3+" can qualify ");
			System.out.println("------------------------------------------");
		}
		if(r4>avg)
		{
			System.out.println("------------------------------------------");
			System.out.println("the speed of racer r4 "+ r4+" can qualify ");		
			System.out.println("------------------------------------------");
		}
		if(r5>avg)
		{
			System.out.println("------------------------------------------");
			System.out.println("the speed of racer r5 "+ r5+" can qualify ");
			System.out.println("------------------------------------------");
		
		}	
	}
}
