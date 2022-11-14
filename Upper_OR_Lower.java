package Lec_05;
import java.util.*;
public class Upper_OR_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println("Upper Case");
		else if(ch>='a' && ch<='z')
			System.out.println("Lower Case");
		else
			System.out.println("Not a character");

	}

}
