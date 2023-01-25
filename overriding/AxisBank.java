package week4.overriding;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit account is created");
	}
public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.fixed();
	ab.deposit();
	
}
}
