package setsexamples.org;

import java.util.LinkedHashSet;

public class RemoveDublicatesinArray {
	public static void usingLinkedHashSets(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		
	}
 
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,1,23,4};
		usingLinkedHashSets(a);

	}

}
