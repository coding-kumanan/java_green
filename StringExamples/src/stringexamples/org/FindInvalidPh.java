package stringexamples.org;

public class FindInvalidPh {

	public static void main(String[] args) {
		String phonenumber = "9489952240";
		char match = ' ';
		int lettercount=0;
		if(phonenumber.length()==10){
			for(int i = 0; i<phonenumber.length();i++) {
				match = phonenumber.charAt(i);
				if(Character.isDigit(match)) {
					lettercount++;
				}
				else {
				System.out.println("Invalid number");
				break;
				}
			}
		}
		else {
			System.out.println("Please enter valid number");
		}
		if(lettercount==10) {
			System.out.println("Enterd mobile number is perfect");
		}
	}
}