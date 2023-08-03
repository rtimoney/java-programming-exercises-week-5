package programmingWeek5Source; 

import java.util.Arrays;

public class Lecture2Part2ModifyingArrayUsingAMethod {

	public static void main(String[] args) {
		
		// create the array   
		int [] listA = new int[] {26,6,22,8};
		
		// create a method which will print the array to screen - see method showArray
		// call showArray to the main method
		showArray(listA);
		
		System.out.println(); 
		
		// create a method which will *2 each value in the array - see method doubleUp
		// call doubleUp to main method  
		doubleUp(listA);
		
		
		// call showArray again to display the new values 
		showArray(listA);
		
		System.out.println();
		
		// sort the array into ascending order
		Arrays.sort(listA);
		// show the now sorted Array
		showArray(listA);
		
	} // end of the main method 
	
	// create a method which will print the array to screen
	public static void showArray(int[] anArray) { // beginning of showArray method
		for (int i=0; i< anArray.length; i++) { // beginning of for loop
			for(int j=0; j<1; j++) {
				System.out.print("|");
				} //
			System.out.print(anArray[i]+" ");
		} // end of for loop
		System.out.println("|"); 
	} // end of showArray method
	
	// create a method which will *2 each value in the array 
	public static void doubleUp(int[] anArray){ // beginning of doubleUp method
		for(int i=0; i< anArray.length; i++) { // beginning of for loop
			anArray[i] = anArray[i] * 2;
		} // end of for loop
	} // end of doubleUp method
	
} // end of the class Lecture2Part2ModifyingArrayUsingAMethod
