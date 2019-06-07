class count{
	int word;
	public int counter(){
	word +=1;
	return word;
	}
	public void seperate(String s){
		int i;
		String letter ="";
		i = (s.length()-1);
		if (s.length()>0){
			while ((i)>=0){
				if (s.substring(i,(i+1)).equals(" ")){
					counter();
					System.out.println(letter);
					letter = "";
				}
				letter=(s.substring(i,(i+1)))+letter;
				if (i == 0){
					System.out.println(letter);
				}
				(i)-=1;

			}
			System.out.println("you have "+(word+1)+" words");
		}
		else System.out.println("you have to enter a message to count words :|");
	}
}

class wordcountrev{
	public static void main(String xyz[]){
		count phrase;
		phrase = new count();
		phrase.seperate("i am the SHAFEEQ");
	}
}