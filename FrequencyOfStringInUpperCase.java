package string;

import java.util.Scanner;//20

public class FrequencyOfStringInUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		isUpperCaseFrequency(s);
		sc.close();
	}

	public static void isUpperCaseFrequency(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') // only upper case
			{
				count[ch - 65]++;
			}

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i + 65) + "------->" + count[i]);
		}
	}

}
