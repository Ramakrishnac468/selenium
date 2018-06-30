package javaaa;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int no;
		int rem;
		int rev=0;
		int temp;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
