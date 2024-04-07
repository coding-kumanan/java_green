package duplicateArray.com;

import java.util.ArrayList;
import java.util.*;

public class DuplicateArray {
	public void FindDuplicate() {
		int a[] = {10,20,30,40,10,20,30,50};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Values are "+ a[i]);	
				}		
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateArray remDup = new DuplicateArray();
		remDup.FindDuplicate();
		

	}

}
