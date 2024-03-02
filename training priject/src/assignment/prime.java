package assignment;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int pnum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		
		if (num<2) {
		System.out.println(num+ "not a prime number");}
		
		else 
		{
			for (int i=2;i<=num/2;i++);
			{
		
			if(num%i==0){
				pnum=1;
				break;
				
			}
			
		}
		if(pnum==1)
			System.out.println(num+ "is not a prime number");
		else 
			System.out.println(num+ "is a prime number");
		
		
	}}
}