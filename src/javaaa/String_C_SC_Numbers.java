package javaaa;

public class String_C_SC_Numbers 
{
	public static void main(String[] args) 
	{
String str="Ram123@&#";
		
		String leters=" ";
		String numbers=" ";
		String symbles=" ";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			//System.out.print(c);
			if(Character.isDigit(c))
			{
				numbers=numbers+c;
			}
			else if(Character.isAlphabetic(c))
			{
				leters=leters+c;
			}
			else
			{
				symbles=symbles+c;
			}
			
		}
		System.out.println(leters);
		System.out.println(numbers);
		System.out.println(symbles);
		
	}

}
