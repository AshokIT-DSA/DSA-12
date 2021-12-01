package org.ar.sorting;

import java.util.Arrays;

public class Insertion {
//1st element is alreadt sorted
public static void main(String[] args) {
	int ar[]=new int[] {2,7,5,12,4,-3,8,-1};
	int n=ar.length;
	for(int i=1;i<n;i++) {
		   int x=ar[i];
		   int j=0;
		for(j=i-1; j>=0;j--) {
			if(ar[j]>x) {
				ar[j+1]=ar[j];
			}
			else {
				break;
			}
		}
		ar[j+1]=x;
	  System.out.println(Arrays.toString(ar));
	}
}	
}
