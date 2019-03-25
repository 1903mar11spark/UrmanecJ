public class Driver {

	//main method in Driver
	/* This is method in our application that drivers the program*/
	public static void main(String[] args) {

		//create FizzBuzz object
		FizzBuzz myFizzBuzz = new FizzBuzz();

		//call fizzBuzz1
		System.out.println("\ntest of myFizzBuzz1: ");
		myFizzBuzz.FizzBuzz1();

		//call fizzBuzz2 with inputs that cause an exception to be thrown.
		System.out.println("\ntest of myFizzBuzz2 w/ exception: ");
		try {
			myFizzBuzz.fizzBuzz2(100,50);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//call fizzBuzz2 with inputs that don't cause an exception to be thrown.
		System.out.println("\ntest of myFizzBuzz2 w/o exception: ");
		try {
		myFizzBuzz.fizzBuzz2(50,100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//call to fizzBuzz3 with inputs that cause exception to be thrown
		System.out.println("\ntest of myFizzBuzz3 w/ exception: ");
		try {
			myFizzBuzz.fizzBuzz3(100, 50, 3, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//call to fizzBuzz3 with inputs that don't cause exception to be thrown
		System.out.println("\ntest of myFizzBuzz3 w/o exception: ");
		try {
			myFizzBuzz.fizzBuzz3(50, 100, 3, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//call to fizzBuzz3 with new inputs (3 and 10) and no exception expected
		System.out.println("\ntest of myFizzBuzz3 with no exception and 3,10 as divisors: ");
		try {
			myFizzBuzz.fizzBuzz3(50, 100, 3, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// call to fizzBuzz4 validating with exception thrown for m not less than n
		System.out.println("\ntest of myFizzBuzz4 with exception for range: ");
		int[] numbers = {3,5};
		String[] terms = {"fizz", "buzz"};
		try {
			myFizzBuzz.fizzBuzz4(100, 50,numbers, terms);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// call to fizzBuzz4 validating with NO exception thrown for m not less than n
		System.out.println("\ntest of myFizzBuzz4 w/o exception for range: ");
		try {
			myFizzBuzz.fizzBuzz4(50, 100, numbers, terms);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// call to fizzBuzz4 with no range exception and with new numbers and terms
		System.out.println("\ntest of myFizzBuzz4 w/o exception for range and with new numbers and terms: ");
		int[] numbers2 = {3,10};
		String[] terms2 = {"crackle", "pop"};
		try {
			myFizzBuzz.fizzBuzz4(50, 100,numbers2, terms2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// test fizzBuzz4 to throw exception when numbers and terms do not have the same length.
		System.out.println("\ntest fizzBuzz4 to throw exception when numbers and terms do not have the same length:");
		String[] terms3 = {"crackle", "pop", "snap"};
		try {
			myFizzBuzz.fizzBuzz4(50, 100,numbers2, terms3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Monday, MAR 25th 12pm. Printouts are all as expected. - Jake U.
	}
	// end of main method


}// end of Driver class

