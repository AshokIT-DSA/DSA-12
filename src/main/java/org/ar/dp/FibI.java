package org.ar.dp;

public class FibI {
	public static void main(String[] args) {
         int n=6;
         int ar[]=new int[n+1];
         for(int i=2;i<=n;i++) {
        	ar[i]=ar[i-1]+ar[i-2];      //O(1)     
         }//O(N)
         System.out.println(ar[n]);//O(1)
	}//N,N
}
