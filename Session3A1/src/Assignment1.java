
public class Assignment1 {
	/*
	 * To calculate square root and cube root of a number in Java. Use Math
	 * class and its static method sqrt(...) & cbrt(...).
	 */
	public static void main(String[] args) {
		double[] numberArray = {13, 54, 42, 19, 23.44, 4, 9, 122};
		
		for(double i: numberArray){
			System.out.print("Number: " + i + "\tsquare root: ");
			System.out.print(Math.sqrt(i));
			System.out.print("\tand cube root: ");
			System.out.println(Math.cbrt(i));
		}
		
		

	}

}
