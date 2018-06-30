package javaaa;

import java.util.Scanner;

public class Sum_Of_Digits 
{
	public static void main(String[] args) 
	{
		int no;
		int rem;
		int sum=0;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}

}
