class Results{
	public static void main(String xyz[]){
		int Phy,Che,Mat,Total;
		float Per;
		Phy=100;
		Che=75;
		Mat=120;
		Total=Phy+Che+Mat;
		Per=Total*100/450;
		System.out.println("Total Marks:"+Total);
		System.out.println("Percentage:"+Per);
		if(Per>=60){
			System.out.println("YOU HAVE PASSED THE EXAM");
		}
		if(Per<60){
			System.out.println("GET OUT NOW, YOU FAILURE!");
		}
	}
}

