package module1;

import java.util.Scanner;

public class elseifladder {
	public static void main(String[] args) {
		System.out.println("Please enter the value");
		Scanner s=new Scanner(System.in);
			int marks =s.nextInt();
			if ((marks>=0)&&(marks<35))
			{
				System.out.println("failed.. "+marks);
			}
			else if ((marks>35)&&(marks<60))
			{
				System.out.println("pass.. "+marks);
			
			}
			else if ((marks>60)&&(marks<80))
			{
				System.out.println("first division.. "+marks);
			
			}
			else if  ((marks>80)&&(marks<=100))
			{
				System.out.println("merit.. "+marks);
			
			}
			else
			{System.out.println("please enter the correct marks");}
		
	}

}
