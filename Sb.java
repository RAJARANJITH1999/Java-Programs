
class Sb
{
	public static void main(String arg[])
	{
		StringBuffer s =new StringBuffer("RAJA ");
		
		String s1 =new String("asdf;lkj");

		s.append("RANJITH ");
		System.out.println(s);
		System.out.println("  ");
		

		int l= s.length();
		s.insert(l,"KUMAR ");
		System.out.println(s);
		System.out.println("  ");
	
		s.delete(1,4);
		System.out.println(s);
		System.out.println("  ");


		s.deleteCharAt(4);	
		System.out.println(s);
		System.out.println("  ");


	
		System.out.println(s1);

	}
}
