class maths2 extends Maths{
	public void multiplication(int X, int Y){
		System.out.println("Result:"+(X*Y));
	}
	public void division(int X, int Y){
		float answer;
		answer = ((float)X/Y);
		System.out.println("Result:"+ answer);
	}
}

class mathsext{
	public static void main(String xyz[]){
		maths2 x;
		x = new maths2();
		x.multiplication(35,10);
		x.Subtraction(10,3);
		x.Addition(50,75);
		x.division(25,10);
	}
}