package module1;
//three parameterized method
//four parameterized method
//default method
//one parameterized method
//two parameterized method

public class assign3method {
	
	public void m1(){	
	System.out.println("default method");
	this.m1(1);
	}
	
	public void m1(int a ){
		System.out.println("one paramterized method");
		this.m1(1,2);
		}
	
	public void m1(int a, int b){
		System.out.println("two parameterized method");
		
		}
	
	public void m1(int a, int b, int c){
		System.out.println("three parameterized method");
		this.m1(1,2,3,4);
		}
	
	public void m1(int a, int b, int c, int d){
		System.out.println("four parameterized method");
		this.m1();
		}
	
   public static void main(String[] args) {
	assign3method objm=new assign3method();
	objm.m1(1,2,3);
	
	
	
	
	
}
}
