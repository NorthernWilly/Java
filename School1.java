class College{
	private int Phy,Che,total;
	float per;

	private void calculations(){
		total = Phy + Che;
		per = total *100/300;
	}

	public void physics(int P){
		if (P>=0 && P<=150){
			Phy = P;
		}
		else{
			Phy = -1;
			System.out.println("Invalid Physics Mark");
		}
	}
	public void chemistry(int C){
		if (C>=0 && C<=150){
			Che = C;
		}
		else{
			Che = -1;
			System.out.println("Invalid Chemistry Mark");
		}
	}
	public void ShowResults(){
		if (Che == -1 || Phy == -1){
			System.out.println("No Results");
		}
		else{
			calculations();
			System.out.println("Total Marks:"+total);
			System.out.println("Percentage:"+per);
		}
	}
}

class School1{
	public static void main(String xyz[]){
		College a;
		a = new College();
		a.physics(80);
		a.chemistry(100);
		a.ShowResults();
	}
}