package module1;

import java.util.Scanner;

public class nestedif {
	
		public static void main(String[] args) {
			System.out.println("Please enter the value of a");
			Scanner s=new Scanner(System.in);
				int a =s	.nextInt();
				if (a>0)
					
				{
					if(a%2==0) 
					{
					System.out.println("number is even");
					}
					else 
					{System.out.println("number is odd");
					}
				}
				else 
				System.out.println("please enter a positive number");
				
}}
