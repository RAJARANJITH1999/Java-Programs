class BuiltInException
{
	public static void main(String[] s)
	{
		int n,i;
		int sum=0;
		try
		{
			n=s.length;
			for(i=0;i<s.length;i++){
				System.out.println(s[i]);
				sum=sum+Integer.parseInt(s[i]);		
			}
			System.out.println("sum = "+sum);
			System.out.println("inside main");
			throw new IllegalAccessException();
		}catch(NumberFormatException nn){
			System.out.println(nn);
		}catch(IllegalAccessException ii){
			System.out.println(ii);
		}
	}
}