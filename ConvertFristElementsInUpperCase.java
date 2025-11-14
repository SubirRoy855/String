package string;

import java.util.Scanner;//15

public class ConvertFristElementsInUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sting value: ");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || ch[i] != ' ' && ch[i - 1] == ' ') {
				ch[i] = (char) (ch[i] - 32);
			}

		}
		String s1 = new String(ch);
		System.out.println(s1);
		sc.close();
	}

}
