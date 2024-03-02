package module1;

import java.util.Scanner;

public class switch1 {
	
		
		public static void main(String[] args) {
			System.out.println("Please enter the value of a and b");
			Scanner s=new Scanner(System.in);
				int a =s.nextInt();
				int b =s.nextInt();
				System.out.println("please enter the type of operator");
				int operator=s.nextInt();
				int result;
				switch (operator) {
				case 1 :
					result=a+b;
					System.out.println("Result is "+result);
					break;
				case 2 :
					result=a-b;
					System.out.println("Result is "+result);
					break;
				case 3 :
					result=a*b;
					System.out.println("Result is "+result);
					break;
				case 4 :
					result=a/b;
					System.out.println("Result is "+result);
					break;
				default :
					System.out.println("Please enter the correct operator");
				break;
				}
		
}
}
