import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	/**
	 * Procedure: To find two strings are anagram or not
	 * ============================================================
	 * 
	 * 1.creating method to check two string are anagram or not 2.Taking user Input
	 * of two strings 3.creating object of anagramDetection 4.calling method into
	 * object of boolean anagram
	 * =============================================================
	 */

	/**
	 * 1.creating method to check two string are anagram or not
	 * 
	 * @param string1
	 * @param string2
	 * @return-checking true or false for anagram
	 */
	private boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length())
			return false;

		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		/**
		 * 2.Taking user Input of two strings
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String string1 = scanner.next();
		System.out.println("Enter the String 2");
		String string2 = scanner.next();

		/**
		 * 3.creating object of anagramDetection
		 */
		AnagramDetection anagramDetection = new AnagramDetection();

		/**
		 * 4.calling method into object of boolean anagram
		 */
		if (anagramDetection.anagram(string1, string2)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
	}

}