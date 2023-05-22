package programmingWeek5Source;

import java.util.Scanner;


public class Lecrure1Part1MethodsWithReturnsCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bigNum;
		
		//first output 
		bigNum = biggestNumber(3, 4);
	    System.out.println(bigNum);
		
	    // second output
		System.out.println(biggestNumber(2002, 900));
		// third output 
		System.out.println(biggestNumber(15, 900));
		
		
		
		
		 
		
		// Exercise II - create an application which retrieves a full name
		
		String name = promptForName();
		if(name.length()==0) {
			System.out.println("Hello stranger!");
		} else {
			System.out.println("Hello " + name);
		} //   
		
		
		
		
		
		
		
	} // end of main method   

/**
 * this is going to return the biggest number 
 * @param num1
 * @param num2
 * @return the biggest number
 */
	public static int biggestNumber(int num1, int num2) {
		return num1 > num2 ? num1 : num2;  // simplified way to code a return
	} // end of method 
	
	
	/**
	 * The purpose of this method is to return a name entered by the user
	 * @return
	 */
	public static String promptForName() {
		
		Scanner keyboard = new Scanner(System.in);
		String name1;
		System.out.print("What is your full name?   :  ");
		name1 = keyboard.nextLine();
		keyboard.close();
		return name1;
	} // end of method  
	
	
	} // end of class // end
