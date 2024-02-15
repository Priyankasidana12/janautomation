package module1;

public class student 
{
	int rollno;
	int age;
  public static void display1() {
	  System.out.println("welcome all of you");
	  }
 public static void display2() {
	 System.out.println("Automation is easy");
	
}
 public static void main(String[] args) {
	student obj = new student();
	obj.display1();
	obj.display2();
	obj.rollno = 1;
	System.out.println("value of rollno" +obj.rollno);
	obj.age = 20;
	System.out.println("value of age" +obj.age);
	
	
}
}
