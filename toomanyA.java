class maths46{
	int A;
	public void message(){
	int A;
	A=20;
	this.A=15;
	System.out.println("The results is: "+A);
	}
	public void message2(){
		System.out.println("check it out now: "+A);
	}
}

class toomanyA{
	public static void main(String xyz[]){
		maths46 x = new maths46();
		maths46 y = new maths46();
		x.message();
		x.message2();
		y.message2();
		y.message();
		y.message2();
	}
}