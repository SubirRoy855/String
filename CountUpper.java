package string;

import java.util.Scanner;

public class CountUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value : ");
		String s1 = sc.nextLine();

		char[] ch = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 96) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("not any Uppercase");
		} else
			System.out.println("upper case value: " + count);
		sc.close();

	}

}
