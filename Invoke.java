import java.util.Scanner;
class Invoke
{
	

	// add function

	void add(int x,int y,int z)
	{
		
		System.out.println("addition of 3 number is="+(x+y+z));
	}

	// main method
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

		// object creating

		Invoke i=new Invoke();
		
		i.add(x,y,z);			
			
	}
}
