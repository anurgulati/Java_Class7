import java.util.Scanner;

public class Class7_Pattern
{
	public static void main(String args[])
	{
		int i=0,j;
		String an=new String();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the String");
		an=Sc.nextLine();
		for(j=1;j<=an.length();j++)
		{
			System.out.println(an.substring(i,j));
		}
	}
}
