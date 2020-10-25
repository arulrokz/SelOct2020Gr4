package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This is Axis Bank deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis = new AxisBank();
		BankInfo bInfo = new BankInfo();
		axis.deposit();
		bInfo.deposit();

	}

}
