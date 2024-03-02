package assignment;

import java.util.Scanner;



public class pallendrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		int p,temp,tot=0;
		p=num;
		while(p>0) {
			
			p=num%10;
			tot=(tot*10)+p;
			p=p/10;
		}
		if(tot==num)
			System.out.println(num+ " is a pallendrome number");
		else 
			System.out.println(num+ " is not a pallendrome1 number");
		
		
	}
}
