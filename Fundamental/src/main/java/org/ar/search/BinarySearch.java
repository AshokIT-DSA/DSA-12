package org.ar.search;

public class BinarySearch {
	public static void main(String[] args) {
		int ar[]= {-7,-1,3,10,17,20,25,50,60};
         boolean res=  bs(ar,13);
         System.out.println(res);
	}

	private static boolean bs(int[] ar, int k) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=ar.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(ar[mid]>k) {
				hi=mid-1;
			}
			else if(ar[mid]<k) {
				lo=mid+1;
			}
			else
				return true;
		}
		return false;
	}
}
