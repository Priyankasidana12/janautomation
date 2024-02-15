package module1;
//{}body of the class
// class - method and variable
// method opertaion or action to perform any action
// varibale - which store any value which can be change

public class class1
{int abc;    // varaible name is abc
		  public void priyanka()// write main and enter control space it will give suggestion
		{//{}boundary of the method
			System.out.println("welcome all of you");
		}
		 public static void main(String[] args) 
		 {// this boundary of main method
			 class1 ob=new class1();   // ob is reference variable syntax===classname reference variable =new classname();
			ob.priyanka	();   // called the method priyanka using . keyboard
			ob.abc=222; // called the the variable abc and assign the value
			System.out.println("value of abc"+ob.abc);
			ob.abc=445;
			System.out.println("value of abc"+ob.abc);
				
		}
}
     
