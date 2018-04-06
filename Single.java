import java.util.Scanner;

class Box
{
	int width;
	int height;
	int depth;

	Box()
	{
		width=height=depth=0;
	}
	Box(int i,int j,int k)
	{
		width=i;
		height=j;
		depth=k;
	}

		
}
class Box1 extends Box
{
	int weight;
	Box1()
	{
		super();
		weight=0;
	}
	
	Box1(int i,int j,int k,int l)
	{
		super();
		weight=l;
	}
	
	void volume()
	{
		int value;
		value=width*height*depth*weight;
		System.out.println("the volume of class Box1="+value);
	}
}

class Single
{
	public static void main(String arg[])
	{
		int value;
		Box1 b= new Box1(1,1,9,2);
		b.volume();
	}
}
