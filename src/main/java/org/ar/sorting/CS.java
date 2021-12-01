package org.ar.sorting;

import java.util.Arrays;

public class CS {
	public static void main(String[] args) {
		int ar[] = new int[] {3,5,1,3,10,2,3,9,4,3,1,4};
           int max=0,ele=0;
           sort(ar);
           System.out.println(Arrays.toString(ar));
           int m=10;
           Arrays.sort(ar);
           //NlogN--MS,QS
		for (int i = 1; i <= m; i++) {
			int c = 0;
			//BS -->p1,p2 (logN)-p2-p1+1
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == i) {
					c++;
				}//1
			}//N
			if(c>max) {
				max=c;
				ele=i;
			}//1
			
		}//M
		//O(N*M)
		//BS NlogN+MlogN
		//M==N
		//N^2
		//NlogN+NLogN--(NlogN)
		System.out.println(ele+" "+max);
	}
	public static void countSort(int ar[]) {
		int n=ar.length;
		int m=10;
		int c[]=new int[m+1];
		for(int i=0;i<n;i++) {
			
			c[ar[i]]++;
		}//N
		int max=0,ele=0;
		for(int i=1;i<m;i++) {
			if(c[i]>max) {
				max=c[i];
				ele=i;
			}
			
		}//m
		//O(N+M),M
		System.out.println(ele+" "+max);
	}
	public static void sort(int ar[]) {
		int n=ar.length;
		int m=10;
		int c[]=new int[m+1];
		for(int i=0;i<n;i++) {
			
			c[ar[i]]++;
		}//N
		//0,2,1,4,2,1,0,0,0,1,1
		int idx=0;
		for(int i=1;i<=m;i++) {
			int x=c[i];
			for(int j=1;j<=x;j++) {
				ar[idx]=i;
				idx++;
			}
		}//N+M
	}//N+M,M
	//BB,SS,IS->N*N
	//M
}
