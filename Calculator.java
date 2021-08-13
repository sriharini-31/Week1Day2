package Week1Day2Assignment;

public class Calculator {
	
	int s1=3, s2=6,s3=0;
	double d1=52, d2=79,d3=0;
	Float f1=5.2f , f2=3.9f , f3;
	String intro="Calculator";

	public String info() {
		// TODO Auto-generated method stub
		return intro;
	}

	public void addition() {
		s3 = s1 + s2;
		System.out.println("The sum of the value is: " + s3);
		
	}

	public void Subtraction() {
		s3 = s2 - s1;
		System.out.println("The subtraction of the value is: " + s3);
		}

	public void multiplication() {
		d3 = d1 * d2;
		System.out.println("The multiplication of the value is :" + d3);
	}

	public void division() {
		f3 = f1 / f2;
		System.out.println("The division of the value is : " + f3);
	}
	

	

	
}
