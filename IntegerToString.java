package string;

import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value: ");
		int a=sc.nextInt();
		
		String s=a+"";
		System.out.println(s);
		sc.close();
	}

}
