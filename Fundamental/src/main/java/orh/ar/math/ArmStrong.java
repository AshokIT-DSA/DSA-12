package orh.ar.math;

public class ArmStrong {
	public static void main(String[] args) {
       int n=15;
       int t=n;
       int sum=0;
       while(n!=0) {
    	   int d=n%10;
    	   n=n/10;
    	   int cube=d*d*d;
    	   sum=sum+cube;
       }
       if(sum==t)
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
	}
}
