class Bank{
	private int amount;

	public void deposit(int money){
		amount+=money;

	}
	public void withdraw(int money){
		if (money<amount){
			amount-=money;
		}
		else {
			System.out.println("Not Enough Funds");
		}
	}
	public void balance(){
		System.out.println("Your balance is:"+amount);
	}
	public Bank(int A){
		System.out.println("Hello you bankers!");
	}
	public Bank(int A,int B){
		System.out.println("I Hate You, No banking today!");
	}
}
class NBS{
	public static void main(String xyz[]){
		Bank ref;
		ref = new Bank(2,3);
		ref.deposit(1000);
		ref.balance();
		ref.withdraw(650);
		ref.balance();
	}
}