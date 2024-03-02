package module1;

//scanner class is used to take inputs from the user
//= is used to assign value 
// == is used for comparison


import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		System.out.println("Please enter the value");
		Scanner s=new Scanner(System.in);
			int a =s.nextInt();
			if (a%2==0) {
				System.out.println("a is even number "+a);
			}
			else {
				System.out.println("the number is odd");
			}
			
		
	}

}
