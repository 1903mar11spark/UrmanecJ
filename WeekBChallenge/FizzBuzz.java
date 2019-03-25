public class FizzBuzz {

	//constructor for FizzBuzz
	public FizzBuzz() {
		super();
		// TODO Auto-generated constructor stub
	}

	//methods

	/*
	//test for FizzBuzz1 functionality

	public void FizzBuzz1() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	*/
	//-------FizzBuzz1-------------
	public void FizzBuzz1() {
		for (int i = 1; i <= 100; i++) {
			if (i%3 != 0 && i%5 != 0) {
				System.out.println(i);
			}
			else if (i%3 == 0 && i%5 == 0) {
				String newString = new String("fizzbuzz");
				System.out.println(newString);
			}
			else if (i%3 == 0) {
				String newString = new String("fizz");
				//String s = Integer.toString(i);
				//s = newString;
				System.out.println(newString);
			}
			else if (i%5 == 0) {
				String newString = new String("buzz");
				System.out.println(newString);
			}
		}
	}
	//----start of method fizzBuzz2---------
	public void fizzBuzz2(int m,int n) throws Exception{
		if (m > n) {
			String message = new String("the lower bound of your range must be less than the upper bound");
			throw new Exception(message);
		}
		for (int i = m; i <= n; i++) {
			if (i%3 != 0 && i%5 != 0) {
				System.out.println(i);
			}
			else if (i%3 == 0 && i%5 == 0) {
				String newString = new String("fizzbuzz");
				System.out.println(newString);
			}
			else if (i%3 == 0) {
				String newString = new String("fizz");
				//String s = Integer.toString(i);
				//s = newString;
				System.out.println(newString);
			}
			else if (i%5 == 0) {
				String newString = new String("buzz");
				System.out.println(newString);
			}
		}
	}
	//-----start of method fizzBuzz3-------------
	public void fizzBuzz3(int m, int n, int fizzNum, int buzzNum) throws Exception{
		if (m > n) {
			String message = new String("the lower bound of your range must be less than the upper bound");
			throw new Exception(message);
		}
		for (int i = m; i <= n; i++) {
			if (i%fizzNum != 0 && i%buzzNum != 0) {
				System.out.println(i);
			}
			else if (i%fizzNum == 0 && i%buzzNum == 0) {
				String newString = new String("fizzbuzz");
				System.out.println(newString);
			}
			else if (i%fizzNum == 0) {
				String newString = new String("fizz");
				//String s = Integer.toString(i);
				//s = newString;
				System.out.println(newString);
			}
			else if (i%buzzNum == 0) {
				String newString = new String("buzz");
				System.out.println(newString);
			}
		}

	}
	//-----start of method fizzBuzz4-------------
	public void fizzBuzz4(int m, int n, int[] numbers, String[] terms) throws Exception {
		if (m > n) {
			String message = new String("the lower bound of your range must be less than the upper bound");
			throw new Exception(message);
		}
		if (numbers.length != terms.length) {
			String message = new String("the numbers and terms arrays must have the same length");
			throw new Exception(message);
		}
		for (int i = m; i <= n; i++) {
			if (i%numbers[0] != 0 && i%numbers[1] != 0) {
				System.out.println(i);
			}
			else if (i%numbers[0] == 0 && i%numbers[1] == 0) {
				String newString = new String(terms[0]+terms[1]);
				System.out.println(newString);
			}
			else if (i%numbers[0] == 0) {
				String newString = new String(terms[0]);
				//String s = Integer.toString(i);
				//s = newString;
				System.out.println(newString);
			}
			else if (i%numbers[1] == 0) {
				String newString = new String(terms[1]);
				System.out.println(newString);
			}
		}
	}
	// end if fizzBuzz4 -----

}// end of FizzBuzz class -----
