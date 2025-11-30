package string;

import java.util.Scanner;

public class StringToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value: ");
		String s = sc.nextLine();

		char[] ch = s.toCharArray();

		for (char c : ch) {
			System.out.println(c);
		}
		sc.close();
	}
}
