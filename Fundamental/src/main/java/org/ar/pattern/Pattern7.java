package org.ar.pattern;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int r=1;r<=n;r++) {
	    	for(int wb=1;wb<=(n-r);wb++) {
	    		System.out.print(" ");
	    	}
	    	
	   	 for(int ch=1;ch<=r;ch++) {
	   		 System.out.print(ch);
	   	 }
	   	 System.out.println();
	    }
	}
}
