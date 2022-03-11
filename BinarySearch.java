import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearch {

	
	/**
	 * PROCEDURE
	 * ===================================================
	 * 1.Created method to binary search of string
	 * 2.giving an input to an array
	 * 3.taking search input
	 * 4.calling method to search
	 * 5.checking found or not
	 * =====================================================
	 */
	
	/**
	 * 
	 * 1.Created method to binary search of string
	 */
	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = x.compareTo(arr[m]);

			// Check x is present at mid
			if (res == 0)
				return m;

			else if (res > 0) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		/**
		 * 2.giving an input to an array
		 */

		String[] arr = { "abc", "veer", "bridgelabz", "yalawar" };

		/**
		 * 3.taking search input
		 */
		String x = "veer";
		/**
		 * 4.calling method to search
		 */
		int result = binarySearch(arr, x);

		/**
		 * 5.checking found or not
		 */
		if (result == -1)
			System.out.println("Element is not present in the index");
		else
			System.out.println("Element found at index number " + result);
	}
}