package javaaa;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		int no;
		int rev=0;
		System.out.println("Enter Number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		while(no>0)
		{
			rev=rev*10;
			rev=rev+no%10;
			no=no/10;
		}
		System.out.println(rev);
	}

}
