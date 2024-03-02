package module1;

public class overloading {
	
	public void sum(int a, int b) {
		
		int c;
		c=a+b;
	System.out.println("the sum is " +c);
	
	}

	
	public int sum(int x, int y, int z) {
		
		int d;
		d=x+y+z;
		System.out.println("the sum is " +d);
		return d;
				
	}
	public static void main(String[] args) {
		overloading obj=new overloading();
		obj.sum(1,2);
		int sumResult = obj.sum(2, 4, 6);
	}
}
