import java.util.Scanner;
class BubbleSort
{
	public static void main(String args[])
	{
		
	
		int n,i,j;
		long ele[],temp;
		ele=new long[30];
	

		// creating an object to class Scanner	
		Scanner s=new Scanner(System.in);

		//reading n value for no of elements to insert
		System.out.println("enter the no of elements to insert");
		n=s.nextInt();
		
		//reading the value into the array
		for(i=0;i<n;i++)
		{
			System.out.println("enter ele["+i+"]");
			ele[i]=s.nextLong();
			
		}
		

		System.out.println("------------------------------------------");

		// displaying the element before sorting
		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}

		System.out.println("------------------------------------------");

		//sorting the elements in ascending order
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{

				if(ele[i]<ele[j])
				{
					temp=ele[j];
					ele[j]=ele[i];
					ele[i]=temp;
				}
			}
		}

		System.out.println("  ");
		//displaying the elements after sorting
		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}

		
	}
}	
		
