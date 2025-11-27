package string;

import java.util.Scanner;

public class Lenght {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i=0;i<ch.length;i++) {
			count++;

		}
		System.out.print("count of the sting: " + count);
		sc.close();
	}

}
