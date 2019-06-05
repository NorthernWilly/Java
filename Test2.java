class Second{
	int Phy,Che;
	public void message(){
		System.out.println("Hello");
		System.out.println("Everbody's Friends");
		System.out.println("Your physics mark is:"+Phy);
	}
}

class Test2{
	public static void main(String xyz[]){
		Second X;
		X = new Second();
		X.Phy=75;
		X.message();
	}
}
