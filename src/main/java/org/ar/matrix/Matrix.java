package org.ar.matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int r=sc.nextInt();
		 int c=sc.nextInt();
         int mat[][]=new int[r][c];
         //i=0,1
         for(int i=0;i<r;i++) {
        	//It each iteration I will get one row
        	 //j=0,1
        	 for(int j=0;j<c;j++) {
        		mat[i][j]=sc.nextInt();
        	 }
         }
         //Print it
         
         for(int i=0;i<r;i++) {
        	 int sum=0;
        	 for(int j=0;j<c;j++) {
        		 sum=sum+mat[i][j];
        		 
        	 }
        	 System.out.println(sum); 
        	
         }
         
	}
}
