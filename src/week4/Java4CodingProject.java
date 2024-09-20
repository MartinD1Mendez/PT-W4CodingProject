package week4;

import java.util.Arrays;

public class Java4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of int called ages that contains the following values: 3, 9,
		// 23, 64, 2, 8, 28, 93.

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		/*
		 * Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 */

		int result = 0;
		result = ages[ages.length - 1] - ages[0];
		System.out.println(result);

		/*
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
		 * longer than the ages array, and have more elements).
		 * 
		 * i. Make sure that there are 9 elements of type int in this new array.
		 */

		int[] ages2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };

		/*
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 * 
		 * iii. Show that using the index values for the elements is dynamic (works for
		 * arrays of different lengths).
		 */

		int results = 0;
		results = ages2[ages2.length - 1] - ages2[0];
		System.out.println(results);

		int resultss = 0;
		resultss = ages2[ages2.length - 1] - ages2[2];
		System.out.println(resultss);

		/*
		 * c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		double sum = 0;
		for (int age : ages2) {
			sum += age;
		}
		double average = sum / ages2.length;
		System.out.println(average);

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */

		String[] names = { "Sam", "Tommy", "Sally", "Buck", "Bob" };

		/*
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 */

		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		int averageOfLetters = sumOfLetters / names.length;
		System.out.println(averageOfLetters);

		/*
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */

		String namesTogether = "";
		for (int i = 0; i < names.length; i++) {
			namesTogether += names[i] + " ";

		}

		System.out.println(namesTogether);

		/*
		 * 3. How do you access the last element of any array?
		 */

		String lastElement = names[names.length - 1];
		System.out.println(lastElement);

		/*
		 * // How do you access the first element of any array?
		 */

		String firstElement = names[0];
		System.out.println(firstElement);

		/*
		 * Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();

		}

		/*
		 * Write a loop to iterate over the nameLengths array and calculate the sum of
		 * all the elements in the array. Print the result to the console.
		 */

		int sumOfElements = 0;
		for (int length : nameLengths) {
			sumOfElements += length;
		}

		System.out.println(sumOfElements);

	}
	/*
	 * Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */

	public static String wordToConcatenate(String word, int n) {
		StringBuilder wordConcatenated = new StringBuilder();
		for (int i = 0; i < n; i++) {
			wordConcatenated.append(word);
		}

		return wordConcatenated.toString();

		/*
		 * Write a method that takes two Strings, firstName and lastName, and returns a
		 * full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */

	}

	public static String addTwoStrings(String firstName, String lastName) {
		String fullName = " ";
		fullName = firstName + " " + lastName;

		return fullName;

		/*
		 * Write a method that takes an array of int and returns true if the sum of all
		 * the ints in the array is greater than 100.
		 */
	}

	public static boolean isSumOfInt(int[] ages2) {
		int sum = 0;
		for (int number : ages2) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		}
		return false;

		/*
		 * Write a method that takes an array of double and returns the average of all
		 * the elements in the array.
		 */

	}

	public static double getAverage(double[] array) {
		double sum = 0;
		double average = 0;
		for (double num : array) {
			sum += num;
		}
		average = sum / array.length;
		return average;

		/*
		 * Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */
	}

	public static boolean isFirstArrayGreater(int[] ages, int[] ages2) {
		int sum = 0;
		int averageAges = 0;
		int sum2 = 0;
		int averageAges2 = 0;

		for (int num : ages) {
			sum += num;
		}
		averageAges = sum / ages.length;

		for (int nums : ages2) {
			sum2 += nums;
		}
		averageAges2 = sum2 / ages2.length;

		if (averageAges > averageAges2) {
			return true;
		}
		return false;

		/*
		 * Write a method called willBuyDrink that takes a boolean isHotOutside, and a
		 * double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */

	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}

		return false;

		/*
		 * Create a method of your own that solves a problem. In comments, write what
		 * the method does and why you created it.
		 */
		
	}
	
	public static boolean dogNeedFood(double foodLevel) {
		if (foodLevel <= 1/2 ) {
			return true;
		}
			return false;
	}

}
