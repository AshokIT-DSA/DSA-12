package orh.ar.math;

import java.util.Scanner;

public class SumOfDigit2 {
	//0  1  2  3 4 5 6 7 8 9 
	//48 49 50 51
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//123
		//49
		//1
		//'2' 50-->2
		int sum=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	//1,'1'
        	sum=sum+(ch-48);
        }
        System.out.println(sum);
	}
}
