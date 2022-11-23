package programmingWeek5Source;

import java.util.Arrays;


public class Lecture2Part2DontReinventTheWheel {

	public static void main(String[] args) {
		
		int [] array = {67, 96, 100, 42};
		
		System.out.println("Unsorted : "+Arrays.toString(array)); 
		
		Arrays.sort(array);
	System.out.println("Sorted: "+Arrays.toString(array));

	}

}
