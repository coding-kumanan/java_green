package arrayexamples.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sun.tools.javac.Main;

public class FindCommonvalue {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		//adding values to Arraylist using arrayaslist method
		ArrayList<Integer> arraylist3 = new ArrayList<Integer>(Arrays.asList(20,30,40));
		//adding values to arraylist using add method 
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(90);
		arraylist.add(10);
		arraylist.add(10);
		arraylist.add(40);
		arraylist.add(50);
		
		//adding values from the array to array list
		int [] arraylist2values = {30,40,50,60,80};
		for(int w:arraylist2values)
			arraylist2.add(w);
		System.out.println(arraylist);
		System.out.println(arraylist2);
		//finding common elements from arraylist and arraylist2 and 
		//store in newlist using retainall method
		ArrayList<Integer> newlist = new ArrayList<Integer>(arraylist);
		newlist.retainAll(arraylist2);
		System.out.println(newlist);
		
		//finding common elements between arraylist and arraylit2
		//and store the common elements in newlist2 using forloop
		ArrayList<Integer> newlist2 = new ArrayList<Integer>(); 
		for(int temp: arraylist) {
			if(arraylist2.contains(temp))
				newlist2.add(temp);
		}
		System.out.println(newlist2);
		//adding values to set from arraylist using add all method
		Set<Integer> newset = new HashSet<Integer>();
		newset.addAll(arraylist);
		System.out.println(newset);
		//adding values to the Hashset using arrayaslist method.
		Set<Integer> newset2 = new HashSet<>(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		System.out.println(newset2);
		//Create linkedHashset using add method
		Set<Integer> newset3 = new LinkedHashSet<>();
		newset3.add(10);
		newset3.add(20);
		newset3.add(30);
		newset3.add(40);
		System.out.println(newset3);
		//Create Treeset using add method 
		Set<Integer> newset4 = new TreeSet<Integer>();
		newset4.add(10);
		newset4.add(11);
		newset4.add(67);
		System.out.println(newset4);
		
}
}
