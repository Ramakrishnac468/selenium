package javaaa;

public class Array_LargeValue 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,};
		
		int large=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println(large);
		
        /*int arr[]= {10,20,30,40,50,};
		
		int small=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println(small);*/
	}

}
