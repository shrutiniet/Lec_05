package Lec_05;
import java.util.*;
public class Rotation_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int num=n;
		int digit=0;
		while(n>0)
		{
			n/=10;
			digit++;
		}
		if(k>digit)
			k=k%digit;
		int divide_by=(int)Math.pow(10, k);
		int value=num%divide_by;
		int remaining=num/divide_by;
		num=value*(int)Math.pow(10, digit-k)+remaining;
		System.out.println(num);
	}
}
