package module1;
// ((((10+2)+2)+2)-2)*2)/2)
public class assignment2 {
	int a;
	int b;
 public int sum(int a,int b) 
 {
	 return a+b;}
 public int sub(int a,int b) {
	 return a-b;}
 public int mult(int a,int b) {
	 return a*b;}
 public int divide(int a,int b) {
	 return a/b;}
  public static void main(String[] args) {
	assignment2 obj = new assignment2();
	int sum1 = obj.sum(10, 2);
	int sum2 = obj.sum(sum1, 2);
	int sum3 = obj.sum(sum2, 2);
	int sub = obj.sub(sum3, 2);
	int mult = obj.mult(sub, 2);
	int div = obj.divide(mult,2);
	System.out.println("the answer is"  +div);
	
	
}
 
}
	


