package javaaa;

import java.util.Scanner;

public class Pattern_1_12_123 
{
	public static void main(String[] args) 
	{
		int no;
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int x=1;x<=no;x++)
		{
			for(int y=x;y>=1;y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
