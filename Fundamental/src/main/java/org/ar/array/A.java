package org.ar.array;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch-97==i)
				c++;
		}
		System.out.println(c);
	}
}
