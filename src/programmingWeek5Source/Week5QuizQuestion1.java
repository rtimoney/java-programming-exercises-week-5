package programmingWeek5Source;

import java.util.Arrays;

public class Week5QuizQuestion1 {

	public static void main(String[] args) {

		// declare vars
		int[] nums = new int[5];
		int count = 0;
		int val = 1;
		
		while(count<15) {
			nums[count%5]+= val;
			System.out.println(count);
			System.out.println(Arrays.toString(nums));
			val++;
			count++;
		} // end of while loop
System.out.println(Arrays.toString(nums));
	} // end of main

}    
