package javaaa;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int no;
		int f1=0,f2=1,f3;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		System.out.print(f1+""+f2);
		for(int i=2;i<no;i++)
		{
			f3=f1+f2;
			System.out.print(f3);
			f1=f2;
			f2=f3;
		}
		
		
		/*int no;
		int f1=0,f2=1,f3;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.print(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}*/
	}

}
