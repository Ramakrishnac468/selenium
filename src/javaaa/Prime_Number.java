package javaaa;

import java.util.Scanner;

public class Prime_Number 
{
	public static void main(String[] args) 
	{
		int no;
		int i;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Not Prime");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime");
		}
	}

}
