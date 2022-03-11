import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * PROCEDURE
 * =================================================================================
 * Reads in strings and prints them in sorted order using insertion sort.
 * 1.created method to sort
 * 2. creating method to print String array
 * 3.creating method to scan String array
 * 
 * ************************MAIN Method*************************************
 * 4.creating object 
 * 5.taking userinput string
 * 6.printing the user input strings
 * 7.calling method to sort the array
 * 8.printing the sorted string
 * =================================================================================
 */
public class InsertionSort1 {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * 1.created method to sort
	 */
	static public void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String key = array[i];
			int j = i - 1;
			// Compare key with each element on the left of it until an element smaller
			// than it is found

			// For descending order, change key<array[j] to key>array[j].
			while (j >= 0 && (key.compareTo(array[j]) < 0)) {
				array[j + 1] = array[j];
				--j;
			}
			// Place key at after the element just smaller than it.
			array[j + 1] = key;
		}
	}

	/**
	 * 2. creating method to print String array
	 */
	static public void printString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println("string at index " + i + " is " + strings[i]);
		}
	}

	/**
	 * 3.creating method to scan String array
	 */
	static public void scanString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("Enter the string at index :%d\n", i);
			strings[i] = scanner.nextLine();
		}
	}

	public static void main(String[] args) {
		/**
		 * 4.creating object
		 */
		
		String[] strings = new String[5];
		
		/**
		 * 5.taking user input string
		 */
		scanString(strings);
		
		System.out.println("Before Sort");
		/**
		 * 6.printing the user input strings
		 */
		printString(strings);
		/**
		 * 7.calling method to sort the array
		 */
		insertionSort(strings);
		
		System.out.println("After Sort");
		/**
		 * 8.printing the sorted string
		 */
		printString(strings);

	}
}