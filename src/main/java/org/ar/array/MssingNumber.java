package org.ar.array;

import java.util.Scanner;

public class MssingNumber {
	public static void main(String[] args) {
        //Size is fixed
		int ar[]=new int[9];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<9;i++) {
			ar[i]=sc.nextInt();
		}
		boolean flag=false;
	for(int x=1;x<=10;x++) {
	//4 1 2 5 7 8 9 3 10	
		
		for(int i=0;i<9;i++) {
			 if(ar[i]==x) {
				 flag=true;
				 break;
			 }
				 
		}
		if(flag==false) {
			System.out.println(x);
			break;
		}
	}
		
	}
}
