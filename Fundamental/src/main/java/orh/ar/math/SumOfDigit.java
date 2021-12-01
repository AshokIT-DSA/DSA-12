package orh.ar.math;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         long n=sc.nextLong();
         //BigInteger,String
         long sum=0;
        while(n!=0) { 
         long d=n%10;//3
         sum=sum+d;
         n=n/10;//12
        }
        System.out.println("sum "+sum);
        
	}
}
