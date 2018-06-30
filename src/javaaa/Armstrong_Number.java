package javaaa;

import java.util.Scanner;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		int no;
		int rem;
		int c=0;
		int temp;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			c=c+(rem*rem*rem);
		}
		if(temp==c)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
