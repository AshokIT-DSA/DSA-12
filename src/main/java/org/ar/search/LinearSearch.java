package org.ar.search;

public class LinearSearch {
public static void main(String[] args) {
	int ar[]= {-1,4,5,-5,-7,2};
	int k=7;
	       boolean res=ls(ar,k);
	       System.out.println(res);
	       int ar1[]= {-1,2,3,8,11,15};
	       
	             boolean res1=sortedLS(ar1,k);
	             System.out.println(res1);
}

private static boolean sortedLS(int[] ar, int k) {
	// TODO Auto-generated method stub
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==k)
			return true;
		if(ar[i]>k)
		  return false;
	}
	return false;
}

private static boolean ls(int[] ar, int k) {
	// TODO Auto-generated method stubk
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==k)
			return true;
	}
	return false;
}


}
