import java.util.Scanner;

class Rectangle
{
	int length,breadth;
	void area()
	{
		int area=length*breadth;
		System.out.println("area of rectangle is " +area);
	}
}
public class Class4_RectangleArea {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Rectangle r1=new Rectangle();
		System.out.println("Enter the length of rectangle");
		r1.length=s.nextInt();
		System.out.println("Enter the breadth of rectangle");
		r1.breadth=s.nextInt();
		r1.area();
	}
}
