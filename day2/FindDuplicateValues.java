package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {
	
	public static void main(String[] args) {
		
		int[] age= {2,5,7,7,5,9,2,3};
		
		Arrays.sort(age);
		
		for (int i = 0; i < age.length; i++) {
			
			for (int j = i+1; j < age.length; j++) {
				
				if(age[i]==age[j]) {
					
					System.out.println("duplicate age found:"+age[j]);
				}
				
			}
			
		}
		
		
		System.out.println("*********************************************************************");
		
		for (int i = 0; i < age.length-1; i++) {
			
			if (age[i]==age[i+1]) {
				
			System.out.println("duplicate age found:"+age[i]);	
				
			}
			
		}
		
		
	}

}
