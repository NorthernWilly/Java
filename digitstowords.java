class digits{
	private String ones(int n){
		String result = "";
		switch(n){
			case 1: result=("one");
			break;
			case 2: result=("two");
			break;
			case 3: result=("three");
			break;
			case 4: result=("four");
			break;
			case 5: result=("five");
			break;
			case 6: result=("six");
			break;
			case 7: result=("seven");
			break;
			case 8: result=("eight");
			break;
			case 9: result=("nine");
			break;
			case 10: result=("ten");
			break;
			case 11: result=("eleven");
			break;
			case 12: result=("twelve");
			break;
			case 13: result=("thirteen");
			break;
			case 14: result=("fourteen");
			break;
			case 15: result=("fifteen");
			break;
			case 16: result=("sixteen");
			break;
			case 17: result=("seventeen");
			break;
			case 18: result=("eighteen");
			break;
			case 19: result=("nineteen");
			break;
		}
		return result;
	}
	private String tens(int A){
		String result = "";
		switch(A){
			case 20: result=("twenty");
			break;
			case 30: result=("thirty");
			break;
			case 40: result=("forty");
			break;
			case 50: result=("fifty");
			break;
			case 60: result=("sixty");
			break;
			case 70: result=("seventy");
			break;
			case 80: result=("eighty");
			break;
			case 90: result=("ninety");
			break;
		}
		return result;
	}
	public void sort(int N){
		String answer = "";

		if (N<=(9999)){
			if (N>=(1000) && N<=(9999)){
			answer+=ones(N/1000)+" thousand ";
			N=(N%1000);
			}
			if (N>=(100)){
			answer+=ones(N/100)+" hundred ";
			N=(N%100);
			}
			if (N>=(20)){
			answer+=tens((N/10)*10)+" ";
			N=(N%10);
			}
			if (N>(0) && N<=(19)){
			answer+=ones(N);
			}
		}
		else{
			answer=" your number is far to large for me";
		}
	System.out.println(answer);	
	}

}

class digitstowords{
	public static void main(String xyz[]){
		digits number;
		number = new digits();
		number.sort(1760);
	}
}
