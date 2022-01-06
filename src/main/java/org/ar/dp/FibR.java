package org.ar.dp;

public class FibR {
	public static void main(String[] args) {
            int n=6;
	}
	public static int compute(int n,int ar[]) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		     if(ar[n]==0)
		      ar[n]= compute(n-1,ar)+compute(n-2,ar);
		     return ar[n];
	}
	//T(n)=T(n-1)+T(n-2)+1
	//T(n)=2T(n-1)+1
	//2^N
}
