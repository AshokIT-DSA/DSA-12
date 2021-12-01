package org.ar.pattern;

import java.util.Scanner;

public class Pattern6 {
/*
1
01
010
1010
*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean gate=true;
        for(int r=1;r<=n;r++) {
       	 for(int c=1;c<=r;c++) {
       		 if(gate==true) {
       		 System.out.print("1");
       		  gate=false;
       		 }
       		 else {
       		 System.out.print("0");
       		 gate=true;
       		 }
       	 }
       	 System.out.println();
        }
	}
}
