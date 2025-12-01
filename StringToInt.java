package string;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Value: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int reverse=0;
		for(int i=0;i<ch.length;i++) {
			reverse=reverse*10+(ch[i]-48);
		}
		System.out.print(reverse+" ");
		sc.close();
	}

}
