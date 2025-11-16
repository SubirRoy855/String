package string;

import java.util.Scanner;

public class CountOfLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97&&ch[i]<=122) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("no lowerCase char");
		}
		else {
			System.out.println("lower case char is: "+count);
			sc.close();
		}
		
	}
}
