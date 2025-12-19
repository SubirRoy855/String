package string;

import java.util.Scanner;

public class UsingCharAtVowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sting: ");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'u') {

				count++;

			}
		}
		System.out.println("Count of Vowel: " + count);
		sc.close();
	}

}
