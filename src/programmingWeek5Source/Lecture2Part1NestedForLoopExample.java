package programmingWeek5Source;

public class Lecture2Part1NestedForLoopExample {

	public static void main(String[] args) {
		
		int [][] myMultiList = new int [3][4];
		for (int row=0; row<3;row++) {
			for (int col=0;col<4;col++) {
				System.out.print(myMultiList[row][col]+" | ");
				
			}  System.out.println(" ");
			System.out.println("---------------");
		} //
		
		
		
		
		
		
		/*for (int outer=1; outer<=3; outer++) {
			for (int inner=1; inner<=5; inner++) {
				System.out.print("*");
			}
		*/	System.out.println();
		}
		

	}

