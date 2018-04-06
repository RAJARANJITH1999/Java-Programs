class Box
{

	int height;
	int width;
	int depth;
 	void setDim(int i,int j,int k)
	{
		width=i;
		height=j;
		depth=k;
	}
	void volume()
	{
		System.out.println("volume of a box="+(width*height*depth));
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b=new Box();
		Box b1=new Box();
		

		b.setDim(1,2,3);
		b1.setDim(12,23,34);
		b.volume();
		b1.volume();
	}
}
