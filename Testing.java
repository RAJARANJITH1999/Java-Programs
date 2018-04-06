import java.util.Scanner;
class Box
{

	int height;
	int width;
	int depth;
 	void setDim()
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("enter the height value");
		height=s.nextInt();
		System.out.println("enter the width value");
		height=s.nextInt();
		System.out.println("enter the depth value");
		depth=s.nextInt();	
	}
	void volume()
	{
		System.out.println("volume of a box="+(width*height*depth));
	}
}
class Testing
{
	public static void main(String args[])
	{
		int object[],i,n;
		Scanner s=new Scanner(system.in);		
		System.out.println("enter how many objects do you need");
		n=s.nextInt();
		object= new int[n];
		for(i=1;i<n;i++)
		{
			Box object[i]=new Box();
		}
		for(i=1;i<object;i++)
		{
			 object[i].setDim();
		}
		for(i=1;i<object;i++)
		{
			object[i].volume();
		}
		
	}
}
