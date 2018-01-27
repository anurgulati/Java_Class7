import java.util.Scanner;

public class Class7_RemoveVowels {

	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String anur=Sc.nextLine();
		String b=anur.replaceAll("[aeiouAEIOU]", " ");
		System.out.println("New String is " +b);
	}
}
