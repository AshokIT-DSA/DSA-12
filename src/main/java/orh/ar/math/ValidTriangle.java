package orh.ar.math;

import java.util.Scanner;

public class ValidTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=1;i<=testCase;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b>c && b+c>a && c+a>b)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
		
	 
	}
}
