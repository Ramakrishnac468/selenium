package overloadingg;

public class OverLoading 
{
	public void m1(int a,int b)
	{
		System.out.println(a+b);
	}
	public void m1(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		OverLoading o1=new OverLoading();
		o1.m1(10, 20);
		o1.m1(10, 20, 30);
	}
}
