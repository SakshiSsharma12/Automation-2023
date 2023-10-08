package Package1;

public class Assignment {
	public int Sum(int a, int b)
	{
		int c;
		c = a+b;
		return c;
	}
	public int Subtract(int d, int e)
	{
		int f;
		f = d-e;
		return f;
	}
	public int multiply(int g, int h)
	{
		int n;
		n = g*h;
		return n;
	}
	public void  Div(int k , int l)
	{
		int m;
		m = k/l;
		System.out.println("The result is " +m);
	}
	
	public static void main(String[] args)
	{
		Assignment xyz = new Assignment();
		int sumresult = xyz.Sum(10, 2);
		int sumresult2 = xyz.Sum(sumresult, 2);
		int Subtractresult = xyz.Subtract(sumresult2 , 2);
		int multiply = xyz.multiply(Subtractresult, 2);
		xyz.Div(multiply, 2);
		}
}
