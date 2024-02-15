package module1;
//three parameterized constructor
//default constructor
//one parameterized constructor
//two parameterized constructor 
//four parameterized constructor

public class assign3cons {

	public assign3cons() {
		this(1,2,3);
		System.out.println("default constructor");
	}
	public assign3cons(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	public assign3cons(int a, int b) {
		this(1);
		System.out.println("two parameterized constructor");
	}
	public assign3cons(int a, int b, int c) {
		
		System.out.println("three parameterized constructor");
	}
	public assign3cons(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("four parameterized constructor");
	}
	public void display()
	{System.out.println("constructor assignment done");}

	public static void main(String[] args) {
		assign3cons obj = new assign3cons(1,2,3,4);
		
		obj.display();
	}
		

}
