package Lec_05;
import java.util.*;
public class Increasing_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prev=Integer.MAX_VALUE;
		int dec=1;
		boolean trace=true;
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			if(dec==1 && num>prev)
				dec=0;
			if(dec==0 && prev>num)
				trace=false;
			if(num==prev)
				trace=false;
			prev=num;
		}
		System.out.println(trace);
	}

}
