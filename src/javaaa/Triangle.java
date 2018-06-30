package javaaa;

import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args) 
	{
		int no;
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int x=0;x<no;x++)
		{
			for(int y=no;y>x;y--)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=x+1;z++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
