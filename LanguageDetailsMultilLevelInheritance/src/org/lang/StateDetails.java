package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("Tamil is a mother language of SouthIndia Tamilnadu");
	}
	private void northIndia() {
		System.out.println("Hindi is most spoken language of NorthIndia");
	}
	public static void main(String[] args) {
		LanguageInfo languageInfo = new LanguageInfo();
		StateDetails stateDetails = new StateDetails ();
		//Only public classes can access from other classes
		languageInfo.tamilLanguage();
		languageInfo.englishLanguage();
		languageInfo.hindiLanguage();
		
		//Private classes can access from with in the same class only. 
		stateDetails.northIndia();
		stateDetails.southIndia();
		
	}

}
