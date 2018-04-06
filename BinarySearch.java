import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		
		
		int ele[],search,first,last,middle,n,i,j,temp;
		
	

		// creating an object to class Scanner	

		Scanner s=new Scanner(System.in);

		//reading n value for no of elements to insert
	
		System.out.println("enter the no of elements to insert");
		n=s.nextInt();
		ele=new int[n];
		
		//reading the value into the array

		for(i=0;i<n;i++)
		{
			System.out.println("enter ele["+i+"]");
			ele[i]=s.nextInt();
			
		}
		

		// displaying the element before sorting

		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}

		//sorting the elements in ascending order


		System.out.println("------------------------------------------");
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

		System.out.println("------------------------------------------");
		for(i=0;i<n;i++)
		{
			System.out.println("ele ["+i+"]= "+ele[i]);
			
		}



		System.out.println("enter the value to search");
		search=s.nextInt();
		

		first=0;
		last=n-1;
		middle=(first+last)/2;

		while(first<=last)
		{
			if(ele[middle]<search)
				first=middle+1;
			else if(ele[middle]==search)
			{

				System.out.println("------------------------------------------");
				System.out.println(search+" found at location"+(middle+1));
				System.out.println("------------------------------------------");	
				break;
			}
			else
				last=middle-1;
			middle=(first+last)/2;	
		}
		if(first>last)
		{
			System.out.println("------------------------------------------");
			System.out.println(search+" is not present in  the list.\n");
			System.out.println("------------------------------------------");

		}
	}
}	
		
