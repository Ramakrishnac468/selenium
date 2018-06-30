package javaaa;

import java.util.Scanner;

public class Even_or_Odd 
{
	public static void main(String[] args) 
	{
		int no;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
