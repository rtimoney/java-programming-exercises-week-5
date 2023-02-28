package programmingWeek5Source;

import java.util.Arrays;

public class Lecture2Part2ArraysContinued {

	public static void main(String[] args) {		
		
		int [][] myMultiList = new int [3][4];
/*
		// assign a value if 1
		for (int row=0; row<3;row++) {
		for (int col=0;col<4;col++) {
			// System.out.print(myMultiList[row][col]+" | ");
			// assign a value 
			myMultiList[row][col] = 1;
		}  System.out.println(" ");
		System.out.println("---------------");
	} //  
	
		// printing
		for (int row=0; row<3;row++) {
				System.out.println(Arrays.toString(myMultiList[row]));
			} // 
*/

	 System.out.println();
	 
	 int num = 1;
		// assign a value if itself * 2
		for (int row=0; row<3;row++) {
		for (int col=0;col<4;col++) {
			// System.out.print(myMultiList[row][col]+" | ");
			// assign a value 
			myMultiList[row][col] = num;
			num *=2;
		}// end of nested for loop
		System.out.println(" ");  }// end of for loop
	
		// printing
		for (int row=0; row<3;row++) {
				System.out.println(Arrays.toString(myMultiList[row]));
			} 
System.out.println("Number of rows : "+myMultiList.length);
System.out.println("Number of columns : "+myMultiList[0].length);
		
	} //
}
