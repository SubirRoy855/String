package string;

import java.util.Scanner;

public class TwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Secand String: ");
		String s2 = sc.nextLine();

		if (s1.length() != s2.length()) {

			System.out.println("String is not Equal");
		} else {
			boolean flag = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					continue;
				} else {
					System.out.println("String are not Equal");
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("String are equal");
		}
		sc.close();
	}
}
