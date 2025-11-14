package string;

import java.util.Scanner;

public class ConvertStringToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value: ");
		String s = sc.nextLine();

		char[] ch = new char[s.length()];

		for (int i = 0; i < ch.length; i++) {

			ch[i] = s.charAt(i);

			System.out.println(ch[i]);
		}

		sc.close();
	}

}
