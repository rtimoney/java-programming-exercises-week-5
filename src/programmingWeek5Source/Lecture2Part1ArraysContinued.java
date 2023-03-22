package programmingWeek5Source;

import java.util.Arrays;

public class Lecture2Part1ArraysContinued {

	public static void main(String[] args) {
		
		int[] list = new int[] {4,2,101};
		
		System.out.println("NEW METHOD");
		
		showArray(list);
	
		// CREATE A PROGRAMME WHICH WILL CALCULATE THE SUM OF THE VALUES IN THE ARRAY
		
/*	int [] list = new int[] {1, 2, 3, 15, 26, 22, 100, 500, -1000};
int total = 0;
 
for (int i=0; i < list.length; i++) {
	
	
	System.out.println("Position  : "+i);
	System.out.println("Value     : "+list[i]);
	
	total += list[i];
	System.out.println("Running total :"+total);
	
	System.out.println(); 
	}
    System.out.println();
	System.out.println("GRAND TOTAL : "+total);
	*/
	
} // end of main method 
	
	public static void showArray(int[] anArray) {
		for (int i=0; i < anArray.length; i++) {
		
			System.out.println("Position  : "+i);
			System.out.println("Value     : "+anArray[i]);
			
			int total =0;
			total += anArray[i];
			System.out.println("Running total :"+total);
			
			System.out.println(); 
			}
		
	} // .
	
}
