package package1;

import java.util.Scanner;

public class Anticlock90 
{

	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int n,i,j,temp;
		
		System.out.println("Enter the square matrix nxn");
		n=in.nextInt();
		
		int[][] a =new int[n][n];
		
		
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		
// L shape swapping
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				temp        = a[i][j];
				a[i][j]     = a[n-j-1][n-i-1];
				a[n-j-1][n-i-1] = temp;
			}
		}
		
// Parallel swaping
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n/2;j++)
			{
				temp      =a[i][j];
				a[i][j]   =a[i][n-j-1];
				a[i][n-j-1] =temp;
			}
		}
		
		
// Print the 90 anti-clockwise square matrix	
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
