package string;

import java.util.Scanner;

public class FrequencyInClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		isFrequency(s);
		sc.close();
	}
	public static void isFrequency(String s) {
		int[] count = new int[128];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') //remove the line if any char should be count
			{
				count[ch]++;
			}

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i) + "------->" + count[i]);
		}
	}

}
