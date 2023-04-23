package programmingWeek5Source;

public class Lecture1Part1Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double b, e;
		b=8;
		e=2;
		double answer = exponentCalculator(b,e);
		System.out.printf("%.0f to the power of %.0f is %.1f\n",b,e,answer);
		
		answer = exponentCalculatorUsingForLoop(b,e);
		System.out.println(answer);
	} // end of main method

	public static double exponentCalculator(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	// this For Loop method will not work for negative numbers 
	public static double exponentCalculatorUsingForLoop(double base, double exponent) {
		double answ =1;
				// we want to go around the loop exponent times as each loop multiplies the answer by the base
				for(int i = 0; i < exponent; i++) {
					answ = answ * base;
				}
			return answ;
	} //
	
	} //    
 
