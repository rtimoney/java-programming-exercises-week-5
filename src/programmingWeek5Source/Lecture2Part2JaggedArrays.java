package programmingWeek5Source;

import java.util.Arrays;

public class Lecture2Part2JaggedArrays {

	public static void main(String[] args) {
		
		// this time we are going to have a set number of rows but a varying number of columns 
		int [][] myMultiListJagged = new int [2][];
		myMultiListJagged[0]= new int [3];
		myMultiListJagged[1]= new int [7];
	
		int [][] myJaggedArray = {{1,2,3,4}, {1,2,3,4,5,6,7, 8, 9, 10}, {1,2,3,4,5}, {2000, 2021, 1993}};
		
		// this section of code is now completely adaptable if we change the number of rows or columns in the Array
		for (int row =0; row<myJaggedArray.length; row++) {
			// toString method adds [] and , to output, tidying up our array output
			// System.out.println(Arrays.toString(myJaggedArray[row]));
			// insert nested for loop:
			for(int col=0; col<myJaggedArray[row].length; col++) {
				System.out.print(myJaggedArray[row][col]+"  ");
			} System.out.println();  // end of nested for loop 
		} //
		
		
			 System.out.println("End of code");
/*			 
			 int num = 1;
				// assign a value if itself * 2
				for (int row=0; row<2;row++) {
				for (int col=0;col<7;col++) {
					// System.out.print(myMultiList[row][col]+" | ");
					// assign a value 
					myMultiListJagged[row][col] = num;
					num *=2;
				}// end of nested for loop
				System.out.println(" ");  }// end of for loop
			
				// printing
				for (int row=0; row<2;row++) {
						System.out.println(Arrays.toString(myMultiListJagged[row]));
					} 
		System.out.println("Number of rows : "+myMultiListJagged.length);
		System.out.println("Number of columns : "+myMultiListJagged[0].length);
*/ 				
			} //
		} //
