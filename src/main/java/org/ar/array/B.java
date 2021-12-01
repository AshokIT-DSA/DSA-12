package org.ar.array;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			b[j]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((a[i]*b[j])%2==0)
					c++;
			}
		}
		System.out.println(c);
				

	}
}
