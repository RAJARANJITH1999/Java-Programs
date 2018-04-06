import java.util.Scanner;
class Try
{


	public static void main(String args[])
	{
		
	
		int n,i,j;
		long ele[],temp,search,mid;
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
		

		// displaying the element before sorting the elements
		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}

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

		//displaying the elements 
		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}

		/*System.out.println("enter the value to search");
		search=s.nextLong();
		mid=n/2;
		if(search>ele[mid])
			{
				for(i=mid;i<n;i++)
				{
					if(search==ele[mid])
					{
						System.out.println("searched value ="+search);

					}
				}
			}
		else if(search<ele[mid])
			{
				for(i=mid;i>=0;i--)
				{
					if(search==ele[mid])
					{
						System.out.println("searched value ="+search);

					}
				}
			}
		else
			
				System.out.println("value not found");*/
	}
}	
		
