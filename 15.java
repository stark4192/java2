class mon5 {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.interest_rate = 5;
		System.out.println("Interest rate : " + s.interest_rate);
		System.out.println("Interest : " + s.calculate_interest(3, 1000));
		System.out.println("New interest rate :" + 10);
		s.modify_intrate(10);
		System.out.println("Interest after modification : " + s.calculate_interest(3, 1000));
	}

}

class SavingsAccount {
	static float interest_rate;
	int accountNo;
	String name;
	int balance;

	float calculate_interest(int t, int principle_amount) {
		return (principle_amount * t * interest_rate) / 100;
	}

	static void modify_intrate(float newrate) {
		interest_rate = newrate;
	}

}