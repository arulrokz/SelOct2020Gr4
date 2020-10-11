package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calculated=0;
		int res=0;
		int reminder;
		int original=153;
		int number=original;
		while (original>0)
		{
			reminder=number%10;
			res=res+(reminder*reminder*reminder);
			original=reminder/10;
		}
		if(original==res)
			System.out.println(original+" is an Armstrong number");
		else
			System.out.println(original+" is not an Armstrong number");
		
	}

}
