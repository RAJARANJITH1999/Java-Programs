// Exception handling
class A
{
	int n,d,res;
	
	A(int i,int j)
	{
		n=i;
		d=j;
	}
	void handle(){
		try{
			res=n/d;	
		}
		catch(ArithmeticException ae)
		{
			System.out.println("sorry user. you have entered 0 as denominator");
			res=0;
		}
		/*catch(Exception ex)
		{
			System.out.println("sorry user. you have entered 0 as denominator");
			res=0;
		}*/
		System.out.println("the result of RES="+res);
	}
}	

class MultipleCatchClauses
{
	public static void main(String args[])
	{
		A ob=new A(1,0);
	
		//ob.handle();
		
	}
}
