package org.ar.array;

public class MinAndMAx {
	public static void main(String[] args) {
            int ar[]= {-6,-1,-4,-6,-9,-10};
            int n=ar.length;
            int min=ar[0];
            int max=ar[0];
            for(int i=0;i<n;i++) {
            	if(ar[i]<min)
            		min=ar[i];
            	//System.out.println(min+" "+i);
            	if(ar[i]>max)
            		max=ar[i];
            }
            System.out.println(max);
	}
}
