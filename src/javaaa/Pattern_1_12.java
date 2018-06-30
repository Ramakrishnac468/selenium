package javaaa;

import java.util.Scanner;

public class Pattern_1_12 
{
	public static void main(String[] args) 
	{
		int no;
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int x=1;x<=no;++x)
		{
			for(int y=1;y<=x;++y)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
