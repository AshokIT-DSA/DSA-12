package org.ar.recusrion;

import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
             int A[][]=new int[3][3];
             Scanner sc=new Scanner(System.in);
             for(int i=0;i<3;i++) {
            	 for(int j=0;j<3;j++) {
            		 A[i][j]=sc.nextInt();
            	 }
             }
             int B[][]=new int[3][3];
            
             for(int i=0;i<3;i++) {
            	 for(int j=0;j<3;j++) {
            		 B[i][j]=sc.nextInt();
            	 }
             }
             int cost=convert(A,B);
             System.out.println(cost);
             
	}

	private static int convert(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		//
		int diff=0;
		  for(int i=0;i<3;i++) {
         	 for(int j=0;j<3;j++) {
         		diff=diff+Math.abs(a[i][j]-b[i][j]);
         	 }
          }
		
		return diff;
	}
}
