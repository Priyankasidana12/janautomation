package module1;

public class parentoverriding extends overriding 
{
	public void arithmetic(int a1 ,int a2)
	{
		int r;
		r= a1-a2;
		System.out.println("the result is " +r);
		
		}
	

	public static void main(String[] args) {
		
	parentoverriding obj= new parentoverriding();
	obj.arithmetic(44, 22);
	


	
	}
	

}
	


