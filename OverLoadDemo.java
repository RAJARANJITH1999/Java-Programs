class OverLoad
{
	//class variable

	int a;
	int b;

	// without parametarized function
	void assignValue()
	{
		a=b=0;
	}

	// single integer  parametarized function
	void assignValue(int i)
	{
		a=b=i;
	}

	// two interger  parametarized function
	void assignValue(int i,int j)
	{
		a=i;
		b=j;
	}
	// single float  parametarized function
	void assignValue(double d)
	{
		System.out.println("Trunckating value d");
		a=b= (int) d;
	}

	public String toString()
	{
		String str;
		str="value of a ="+a ;
		str+="   value of b ="+b ;
		return str;
	}

}
class OverLoadDemo
{
	public static void main(String a[])
	{
		OverLoad o=new OverLoad();

		o.assignValue();
		System.out.println(o);

		o.assignValue(4);
		System.out.println(o);

		o.assignValue(4,4);
		System.out.println(o);

		o.assignValue(4.0);
		System.out.println(o);
	}
}
