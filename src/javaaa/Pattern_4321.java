package javaaa;

import java.util.Scanner;

public class Pattern_4321 
{
	public static void main(String[] args) 
	{
		int no;
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int x=no;x>=1;x--)
		{
			for(int y=x;y>=1;y--)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
