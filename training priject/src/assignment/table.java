package assignment;

import java.util.Scanner;

public class table {
	

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		System.out.println("table of" +num+ "is printed below:");
		for (int i = 1;i<=10;i++){
			int result =num*i;
			System.out.println(num+ "*"  +i+ "=" +result);
			
					
		}
		}}
