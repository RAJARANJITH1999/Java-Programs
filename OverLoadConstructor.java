class OverLoad
{
	//class variable

	int a;
	int b;

	// without parametarized Constructor
	OverLoad()
	{
		a=b=0;
	}

	// single integer datattype parametarized Constructor
	OverLoad(int i)
	{
		a=b=i;
	}

	// two interger datatype parametarized Constructor
	OverLoad(int i,int j)
	{
		a=i;
		b=j;
	}
	// single float datatype parametarized Constructor
	
	public String toString()
	{
		String str;
		str="value of a ="+a ;
		str+="   value of b ="+b ;
		return str;
	}

}
class OverLoadConstructor
{
	public static void main(String a[])
	{
		OverLoad o=new OverLoad();
		System.out.println(o);

		OverLoad o1=new OverLoad(2);
		System.out.println(o1);

		OverLoad o2=new OverLoad(3,3);
		System.out.println(o2);


	}
}
