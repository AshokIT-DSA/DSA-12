package org.ar.twopointer;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
       int a[]=new int[] {3,5,10,12,20,23};
       int b[]=new int[] {-4,-2,7,11,13,14,16,17,18};
       int p1=0;
       int p2=0;
       int n=a.length;
       int m=b.length;
       int idx=0;
       Integer i=10;
               
       int c[]=new int[n+m];
       while(p1<n && p2<m) {
    	   if(a[p1]<b[p2]) {
    		      c[idx]=a[p1];
    		      p1++;
    	   }
    	   else {
    		   c[idx]=b[p2];
    		   p2++;
    	   }
    	   idx++;
       }
       while(p1<n) {
    	   c[idx]=a[p1];
		      p1++;
       }
       while(p2<m) {
    	   c[idx]=b[p2];
		   p2++;
       }
       System.out.println(Arrays.toString(c));
	}
}
