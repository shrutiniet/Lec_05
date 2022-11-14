package Lec_05;
import java.util.*;
public class Inverse_with_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int pos=1;
		while(n!=0)
		{
			int rem=n%10;
			int mul=(int)Math.pow(10,rem-1);
			rev=rev+pos*mul;
			n/=10;
			pos++;
		}
		System.out.println(rev);
	}

}
