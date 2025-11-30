package string;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sting: ");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String s1="";
		for (int i = ch.length - 1; i >= 0; i--) {
			s1=s1+ch[i];
		}
		System.out.println(s1);
		sc.close();
	}
}