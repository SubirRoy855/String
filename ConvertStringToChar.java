package string;//14

import java.util.Scanner;

public class ConvertStringToChar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		String s=sc.nextLine();
		char[] ch=new char[s.length()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=s.charAt(i);
		}
		System.out.println("char array");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		sc.close();
	}

}
