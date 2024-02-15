package module1;
// ((((10/2)-2)+2)-2)/2)
public class assign2b {
	int a;
	int b;
 public float sum(float a,float b) 
 {
	 return a+b;}
 public float sub(float a,float b) {
	 return a-b;}
 public float divide(float a,float b) {
	 return a/b;}
 public float divide2(float a,float b) {
	 return a/b;
 }
  public static void main(String[] args) {
	assign2b obj = new assign2b();
	float div = obj.divide(10, 2);
	float sub = obj.sub(div, 2);
	float sum = obj.sum(sub, 2);
	float sub2 = obj.sub(sum, 2);
	float div2 = obj.divide2(sub2, 2);
	
	System.out.println("the answer is"  +div2);
	
	
}
 
}