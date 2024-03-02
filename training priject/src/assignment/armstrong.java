package assignment;

import java.util.Scanner;



public class armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		int number,temp,tot=0;
		number=num;
		while(number!=0) {
			
			temp=number%10;
			tot=tot+temp*temp*temp;
			number=number/10;
		}
		if(tot==num)
			System.out.println(num+ " is a armstrong number");
		else 
			System.out.println(num+ " is not a armstrong number");
		
		
	}
}
