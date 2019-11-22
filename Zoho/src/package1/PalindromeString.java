package package1;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s;
		int l,j=1;
		boolean flag=false;
		System.out.println("Enter the string");
		s=in.nextLine();
		l=s.length()-1;
		
        while(j<l)
        {
    		if(isPalindrome(s,0,j) && isPalindrome(s,j+1,l))
    		{
    			System.out.println("Entered string " + s.substring(0,j+1)+s.substring(j+1,l+1) + " is valid");
    			flag=true;
    			break;
    		}
    		j++;
        }
        
        if(flag==false)
        {
        	System.out.println("Entered string is invalid");
        }
        
	}
	
	
	public static boolean isPalindrome(String s1,int front,int end)
	{
		
		for( ;front<end; front++,end--)
		{
			if(  s1.charAt(front) != s1.charAt(end) )
			{
				return false;
			}
		}
		return true;
		
	}

}
