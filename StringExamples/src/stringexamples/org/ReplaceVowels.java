package stringexamples.org;

public class ReplaceVowels {
	public String replaceVowels(String text, char ch) {
		char [] vowles = {'a', 'e','i','o','u'};
		for(char iration: vowles) {
			text = text.replace(iration, ch);	
	}
		return text;
	}
//this program replace the vowels in given String with given char 
	public static void main(String[] args) {
		ReplaceVowels text = new ReplaceVowels();
		System.out.println(text.replaceVowels("kumanan", '#'));
	}
	
}
