package assignment;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		int n1=0,n2=1;
		int n3;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		System.out.println("The fibonacci series is :");
		System.out.println(n1+"" +n2);
		for(int i=1;i<num-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
		}
	}

}
