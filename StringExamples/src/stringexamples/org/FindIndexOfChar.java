package stringexamples.org;

public class FindIndexOfChar {
	public static int index(String str, char cha) {
		int index = str.indexOf(cha);
		return index;
		
	}
	public static int lastIndex(String str, char cha) {
		return str.lastIndexOf(cha);
		
	}
	public static void main(String[] args) {
		System.out.println("The index of the 'o' is "+index("GreensTechnology", 'o'));
		System.out.println("The lastIndex of the 'emptyspace' is "
		+lastIndex("J a v a p r o g r a m", ' '));
		System.out.println(index("9095484678", '8'));
		String[] str = {"kumanan", "mk", "uuk"};
		for(String w:str)
		System.out.println("Index of 'k' in "+w+" is "+w.indexOf('k'));
			
		}
	}


