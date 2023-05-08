package programmingWeek5Source;

public class Lecture2Part1EnhancedForLoop {

	public static void main(String[] args) {
		// for each statement / enhanced for loop
		
		//create array
		int[] list = new int[] {4,2,101};
		
		// enhanced for loop which will print each value in the array 'list'
		// the enhanced for loop will go through every index position without an evaluation
		for (int number : list) {
			System.out.println("Value : "+number);
		} // end of for loop
		
	} //  

} //  
 
