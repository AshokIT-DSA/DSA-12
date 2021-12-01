package org.ar.search;

import java.util.Scanner;

public class FindingSingleElement {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
          int ar[]=new int[n];
          for(int i=0;i<n;i++)
        	   ar[i]=sc.nextInt();
            int x= bs(ar);
            System.out.println(x);
            //aaccfbbee
	}

	private static int bs(int[] ar) {
		// TODO Auto-generated method stub
		  int lo=0;
          int hi=ar.length-1;
          //0 1 2 3 4 5 6 7 8
          //1 1 1 1 3 4 4 5 5
          if(ar.length==1)
        	  return ar[0];
          if(ar[0]!=ar[1])
        	  return ar[0];
          if(ar[ar.length-1]!=ar[ar.length-2])
        	  return ar[ar.length-1];
          while(lo<=hi) {
       	   int mid=(lo+hi)/2;
       	   if(ar[mid]!=ar[mid-1] && ar[mid+1]!=ar[mid]) {
       		   return ar[mid];
       	   }
       	   if(mid%2==0) {
       		   if(ar[mid]==ar[mid+1])
       			   lo=mid+1;
       		   else
       			   hi=mid-1;
       	   }
       	   else {
       		 if(ar[mid]==ar[mid-1])
     			   lo=mid+1;
     		   else
     			   hi=mid-1;
       	   }
          }
          return -1;
         
	}
}
