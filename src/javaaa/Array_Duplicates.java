package javaaa;

import java.util.HashSet;

public class Array_Duplicates 
{
	public static void main(String[] args) 
	{
		String []strarray= {"abc","def","pqr","xyz","pqr","abc"};
		HashSet<String> set=new HashSet<>();
		for(String str:strarray)
		{
			if(!set.add(str))
			{
				System.out.println(str);
			}
		}
	}

}
