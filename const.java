class one{
	public one(){
	System.out.println("why");
	}
	public one(int A){
		System.out.println("I");
	}
}
class two extends one{
	public two(){
		System.out.println("is this");
	}
	public two(int A){
		super(1);
		System.out.println("do");
	}
}
class three extends two{
	public three(){
		System.out.println("hard?");
	}
	public three(int A){
		super(1);
		System.out.println("understand, its rather simple");
	}
}
class const{
	public static void main(String xyz[]){
		three x = new three();
	}
}
