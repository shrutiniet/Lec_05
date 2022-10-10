package Lec_05;
import java.util.*;
public class Rotation_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int num=n;
		int digit=0;
		while(n>0)
		{
			digit++;
			n/=10;
		}
		if(k>digit)
		{
			k=k%digit;
		}
		for(int i=0;i<k;i++)
		{
			int value=num%10;
			int rem=num/10;
			int power=(int)Math.pow(10,digit-1);
			num=value*power+rem;
			System.out.println("R"+i+": "+num);
		}
	}

}
