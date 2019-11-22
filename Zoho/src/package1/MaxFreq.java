package package1;
import java.util.Scanner;

public class MaxFreq
{

	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		int n,i;
		
		System.out.println("Enter the total no of the elements");
		n=in.nextInt();
		
		int[] a =new int[n];
		int[] fr=new int[n];
		
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		frequency(a,fr,n);
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" "+fr[i]);
		}
			
	}
	
	public static void frequency(int[] arr,int[] freq,int n1)
	{
		int i,j,k;
		
		for(i=0;i<n1;i++)
		{
			freq[i]=1;
			for(j=i+1;j<n1;j++)
			{
				if(arr[i]==arr[j])
				{
					freq[i]++;
					for(k=j;k<n1-1;k++)
					{
						arr[k]=arr[k+1];
					}
					j=j-1;
					n1=n1-1;
				}
			}
				
		}
		
		printMaxFreqElement(arr,freq,n1);
		
	}
	
	
	public static void printMaxFreqElement(int[] a1,int[] fr1,int n2)
	{
		int i,max,j;
		max=fr1[0];
		
		for(i=1;i<n2;i++)
		{
			if(fr1[i]>max)
			{
				max=fr1[i];
			}
		}
		
		System.out.println(max);
	}
	
	
}
