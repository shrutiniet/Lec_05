package Lec_05;
import java.util.*;
public class Rotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rot=sc.nextInt();
		int divide_by=(int)Math.pow(10, rot);
		int val1=n%divide_by;
		int rem=n/divide_by;
		int digit=Digit(rem);
		int pow2=(int)Math.pow(10, digit);
		int ans=pow2*val1+rem;
		System.out.println(ans);
		
	}
	public static int Digit(int n)
	{
		int dig=0;
		while(n!=0)
		{
			dig++;
			n/=10;
		}
		return dig;
	}
}
