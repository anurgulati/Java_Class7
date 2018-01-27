import java.util.Scanner;

public class Class7_Occurrence 
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String first=Sc.nextLine();
		System.out.println("Enter second string");
		String second=Sc.nextLine();
		if(first.contains(second))
		{
			System.out.println("true");
		}
			else
				System.out.println("False");
		
		
	}
	

}
