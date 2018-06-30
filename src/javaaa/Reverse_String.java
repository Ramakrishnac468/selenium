package javaaa;

import java.util.Scanner;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String str;
		String rev=" ";
		System.out.println("enter string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
