package package1;
import java.util.*;

public class Frequency 
{

	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int n,i,j,k;
		
		System.out.println("Enter the total no of the elements");
		n=in.nextInt();
		int n1=n;
		
		int[] a =new int[n];
		int[] fr=new int[n];
		
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
// To get the frequency & remove repeated elements
		
		for(i=0;i<n;i++)
		{
			fr[i]=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					fr[i]++;
					for(k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					j=j-1;
					n=n-1;
				}
			}
				
		}
		
// print the individual elements and their frequency
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" "+fr[i]);
		}
		
// print all elements in array and frequeny
 
		for(i=0;i<n1;i++)
		{
			System.out.println(a[i]+" "+fr[i]);
		}
		
		
	}

}
