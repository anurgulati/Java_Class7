import java.util.Scanner;

public class Class7_Substring
{
	public static void main(String args[])
	{
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		a=s.nextLine();
		for(int i=0; i<a.length(); i++)
		{
			for(int j=i+1; j<=a.length(); j++)
			{
				System.out.println(a.substring(i,j));
			}
		}		
	}
}
