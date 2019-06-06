class taxcalc extends calculations{
	public void Tax(int salary){
		float Result;
		Result =((float)salary*21/100);
		System.out.println("your tax is:"+Result);
	}
}

class calculations2{
	public static void main(String xyz[]){
		taxcalc x;
		x = new taxcalc();
		x.Tax(2353);
	}
}