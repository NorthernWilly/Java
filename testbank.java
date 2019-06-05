class bank{
	static int dollar;
	public void setdollar(int A){
		dollar = A;
	}
	public void amount (int B){
		System.out.println("Amount is"+dollar);
	}
}

class testbank{
	public static void main(String xyz[]){
		bank HSBC,Natwest,NBS;
		HSBC = new bank();
		Natwest = new bank();
		NBS = new bank();
		HSBC.setdollar(100);
		NBS.amount(2);
		NBS.setdollar(60);
		Natwest.amount(2);

	}
}