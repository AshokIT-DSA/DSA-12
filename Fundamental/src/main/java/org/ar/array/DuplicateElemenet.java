package org.ar.array;

public class DuplicateElemenet {
	public static void main(String[] args) {
		//count(1)-->1,0
		
         int ar[]= {3,1,5,-1,7,5,1,-1,8,-1};
         int n=ar.length;
         //c(3)-0
         //c(1)-1
         //c(5)-1
         //c(-1)-1
         //c(7)-0
         //c(5)-0
         for(int i=0;i<n;i++) {
        	 int x=ar[i];
        	 int c=0;
        	 for(int j=i+1;j<n;j++) {
        		 if(x==ar[j])
        			 c++;
        	 }
        	
        	 //1
        	 if(c>0)
        		 System.out.println(ar[i]);
         }
	}
}
