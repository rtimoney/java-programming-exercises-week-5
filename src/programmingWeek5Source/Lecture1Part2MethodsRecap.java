package programmingWeek5Source;

public class Lecture1Part2MethodsRecap {
// Shoe Size exercise
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myB;
		myB = 5/3;
		System.out.println(myB);
		
		String myString = "Rpnan";
		System.out.println(myString);

		
		double answer = getShoeAverage(5, 6, 10, 12, 11, 1);
		
		System.out.println(answer);
		
		System.out.printf("%s%8s%n","Index","Value");
		
		int[] myArray = new int[11]; // 11 = how many elements of type int are going to be integrated 
		
		
		
		for(int i = 0; i<myArray.length; i++){
		myArray[i] = i+2;
		}// end of for loop
		
		for(int i = 0; i<myArray.length; i++){
			System.out.printf("%5d%8d%n", i ,myArray[i]);
		}// end of for loop 
	} // end of main method 
	

	
	public static double getShoeAverage(int s1, int s2, int s3, int s4, int s5, int s6) {
		int numshoes = 6;
		double answer = (double)(s1+s2+s3+s4+s5+s6)/(double)(numshoes);
		return answer;
	} // end  of getShoeAverage method
 
} // end of class
