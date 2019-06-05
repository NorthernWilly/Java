class Results{
	private int Phy,Che,Mat;
	public void Physics(int p){
		if (p>=0 && p<+150){
			Phy=p;}
		else {
			Phy= -1;
			System.out.println("Invalid Physics Mark");
		}
	}

	public void Chemistry(int c){
		if (c>=0 && c<=150){
			Che=c;
		}
		else {
			Che= -1;
			System.out.println("Invalid Chemistry Mark");
		}
	}
	public void Maths(int m){
		if (m>=0 && m<=150){
			Mat=m;
		}
		else {
			Mat= -1;
			System.out.println("Invalid Maths Mark");
		}
	}
	
	public void ShowResults(){
		int total;
		float per;
		if (Phy==-1||Che==-1||Mat==-1){	
			System.out.println("INVALID MARKS ____ NO RESULTS");
		}
		else{
			total = Phy+Che+Mat;
			per = (float)total*100/450;
			System.out.println("Total Score: "+total);
			System.out.println("Percentage: "+per);
			if (total>300){
			System.out.println("PASSED");
			}
			else{
			System.out.println("FAILED");
			}
		}
	}
}

class School{
	public static void main(String xyz[]){
		Results Phil,Bob;
		Phil=new Results();
		Bob=new Results();
		Phil.Physics(75);
		Phil.Chemistry(87);
		Phil.Maths(69);

		Bob.Maths(123);
		Bob.Chemistry(54);
		Bob.Physics(97);

		Phil.ShowResults();
		Bob.ShowResults();

	}
}