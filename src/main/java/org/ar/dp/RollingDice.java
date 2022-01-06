package org.ar.dp;

public class RollingDice {
	public static void main(String[] args) {
		int n=10;
        int dp[]=new int[n+1];
        
        dp[0]=1;
        //-->0 --1
        //--1,0---2
        //--2,1,0--3
        //--3,2,1,0---4
        //--4,3,2,1,0--5
        //--5,4,3,2,1,0---6
        //--6,5,4,3,2,1--7
        //i=7,j=1,2,3,4,5,6
        for(int i=1;i<=n;i++) {
        //	dp[i]=dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4]+dp[i-5]+dp[i-6];
        	for(int j=1;j<=6 && i-j>=0;j++) {
        		dp[i]+=dp[i-j];//1
        	}//6*1
        }//6n
        System.out.println(dp[n]);
        //N,N
	}
}
