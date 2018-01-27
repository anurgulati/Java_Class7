

class Overload
{
	void Print() 
	{
		System.out.println("Hello");
	}
	void Print(int n)
	{
		System.out.println(n);
	}
	void Print(float f)
	{
		System.out.println("Hello " + f);
	}
	
}

public class Class5_PrintOverload_Inheritance
{
	public static void main(String args[])
	{
		
		Overload o1=new Overload();
		Overload o2=new Overload();
		Overload o3=new Overload();
		o1.Print();
		o2.Print(5);
		o3.Print(6.7f);
		
	}



}
