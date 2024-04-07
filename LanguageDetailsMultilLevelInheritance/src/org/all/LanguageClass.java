//Child
package org.all;
import org.tamil.Tamil;

public class LanguageClass extends Tamil {
	private void alllanguage() {
		//LanguageClass lang = new LanguageClass();
		System.out.println("\u001B[1mList of Languages");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LanguageClass lang = new LanguageClass();
		lang.alllanguage();
		System.out.println("--------------------------------");
		lang.englishlanguage();
		System.out.println("--------------------------------");
		lang.tamillanguage();
		System.out.println("--------------------------------");
		lang.telgulanguage();
		System.out.println("--------------------------------");
		
	}

}
