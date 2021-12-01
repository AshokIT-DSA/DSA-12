package org.ar.sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {
         int ar[]= {5,-1,4,1,2};
         int n=ar.length;
         bs(ar,n);
         System.out.println(Arrays.toString(ar));
	}

	private static void bs(int[] ar, int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n-1;i++) {
			for(int j=0;j<=n-2;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
}
