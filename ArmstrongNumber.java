package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=153;
		int res=0;
		int rem=0;
		int arm=0;
		
		
		while(n>0) {
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(res);
		if(n==res)
		{
			System.out.println("Number is an ARMSTRONG number");
		}
		else
			System.out.println("Number is not an ARMSTRONG NUMBER");

	}

}
