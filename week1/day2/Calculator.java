package week1.day2;

public class Calculator {

	
	public int Add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
	}
	public int Sub(int num1, int num2, int num3) {
		int sub=num1-num2-num3;
		return sub;
	}
	public double Multiply(double num1, double num2) {
		double product=num1*num2;
		return product;
	}
	public float Division(float num1, float num2) {
		float div = num1/num2;
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc = new Calculator();
int sum = calc.Add(2, 4, 6);
System.out.println("Add :"+sum);

int sub = calc.Sub(23, 45, 12);
System.out.println("Sub :"+sub);
	
		
	}

}
