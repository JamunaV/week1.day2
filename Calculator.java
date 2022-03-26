package week1.day2;

public class Calculator {
	
	public int addition(int a,int b) {
		return a+b;
		
	}
	
	public int subtraction(int a,int b) {
		return a-b;
		
	}
	
	public int multipy(int a,int b) {
		return a*b;
		
	}
	
	public int divide(int a,int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int addval=c.addition(2, 3);
		int subVal=c.subtraction(3, 6);
		int mulVal=c.multipy(4, 4);
		int dival=c.divide(2, 4);
		System.out.println("Adding a value is : "+addval);
		System.out.println("Subtracting a value is : "+subVal);
		System.out.println("Multiplying a value is : "+mulVal);
		System.out.println("Dividing a value is : "+dival);
		

	}

}
