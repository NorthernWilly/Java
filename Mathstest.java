class Maths {
	public void Addition (int A, int B){
		int Result;
		Result = A + B;
		System.out.println("Result:"+Result);
	}
	public int Subtraction(int A, int B){
		int answer;
		answer = A - B;
		return answer;
	}
}

class Mathstest{
	public static void main(String xyz[]){
		Maths x;
		x = new Maths();
		x.Addition(2,10);
		System.out.println("Result is:"+ x.Subtraction(50,5));
	}
}