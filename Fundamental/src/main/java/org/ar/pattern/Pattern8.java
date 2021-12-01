package org.ar.pattern;

public class Pattern8 {
	public static void main(String[] args) {
        int n=4;
        char ch='A';
        for(int r=1;r<=n;r++) {
        	ch='A';
        	for(int c=1;c<=r;c++) {
        		
        		System.out.print(ch);
        		ch++;
        	}
        	System.out.println();
        }
	}
}
