package module1;

public class inheritenceswift extends inheritencemaruti{

	private int abc;
	public void method3() {
		System.out.println("this is child method 3");
	}
	
	public void method4() {
		System.out.println("this is child method4");
		
	}
	public static void main(String[] args) {
		inheritenceswift s= new inheritenceswift();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
		s.abc=123;
		System.out.println("the value of abc");
	}
}
	
