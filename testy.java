class one{
	int A;
	public void msg1(){
		System.out.println("hello");
	}
}

class two extends one{
	int B;
	public void msg2(){
		System.out.println("MANNNNCHHHHHEEESSSSTTTTTEEEERRRRRR");
	}
}

class testy{
	public static void main(String xyz[]){
		one ref;
		ref = new two();
		ref.msg2();
		ref.B=15;
	}
}