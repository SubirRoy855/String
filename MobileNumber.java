package string;

import java.util.Scanner;

public class MobileNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sting: ");
		String s = sc.nextLine();
		System.out.println("enter the index:");
		int index = sc.nextInt();
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < ch.length; i++) {

			if (i < index) {
				s1 = s1 + 'x';
			} else
				s1 = s1 + ch[i];
		}
		System.out.println(s1);
		sc.close();
	}
}
