package string;

import java.util.Scanner;

public class CountOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sting: ");
		String s = sc.nextLine();

		// using toCharArray...
		char[] ch = s.toCharArray();

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'E' || ch[i] == 'e' || ch[i] == 'I' || ch[i] == 'i'
					|| ch[i] == 'O' || ch[i] == 'o' || ch[i] == 'U' || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println("Count of Vowel cha: " + count);
		sc.close();

	}

}
