package week1.day2;

public class Calculator1 {
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public double mul(double a,double b) {
		return a*b;			
	}
	public float div(float a,float b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		System.out.println(cal1.add(10,3,7));
		System.out.println(cal1.sub(15,3));
		System.out.println(cal1.mul(177,36987));
		System.out.println(cal1.div(3.14f,1.25f));
		

	}

}
