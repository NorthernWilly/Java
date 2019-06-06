abstract class draw{
	abstract public void drawing();
	
}

class line extends draw{
	public void drawing(){
	System.out.println("drawing line");
	}
}

class circle extends draw{
	public void drawing(){
		System.out.println("drawing circle");
	}
}

class drawtest{
	public static void main(String xyz[]){
		line x = new line();
		letsdraw(x);
		circle c = new circle();
		letsdraw(c);

	}
	public static void letsdraw(draw D){
		D.drawing();

	}
}