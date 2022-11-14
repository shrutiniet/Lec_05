package Lec_05;
import java.util.*;
public class Rotate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=sc.nextInt();
		int i=1;
		while(i<=pos)
		{
		int result=Reverse(n);		
		System.out.println(result);
		n=result;
		i++;
		}

	}
public static int Reverse(int n)
{
		int ans=0;	
		int rem=n%10;
		int remaining=n/10;
		int nod=NO_of_Digit(remaining);
		int pow=(int)Math.pow(10, nod);
		ans=rem*pow+remaining;	
		return ans;
}
public static int NO_of_Digit(int n)
{
	int did=0;
	while(n!=0)
	{
		did++;
		n/=10;
	}
	return did;
}
}
