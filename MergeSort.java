

import java.util.ArrayList;
import java.util.Scanner;
public class MergeSort {
	/**
	 * 
	 *  1. Find sizes of two sub arrays to be merged
	 *  2.Create temp arrays 
	 *  3.Copy data to temp arrays
	 *  4. Merge the temp arrays 
	 *  5. Initial indexes of first and second subarray 
	 *  6. Initial index of merged subarray array
	 *  7.Copy remaining elements of L[] if any
	 *  8.Copy remaining elements of R[] if any
	 *  9.Main function that sorts arr[l..r] using merge() 
	 *  10.Find the middle point
	 *  11. Sort first and second 
	 *  12.Merge the sorted
	 *  13.function to print array of size n
	 * ********** MAIN*************** 
	 *  14.Printing a array 
	 *  15. creating object of method
	 *  16.calling method in object
	 *  17.printing merged and sorted array
	 */

	void merge(int arr[], int l, int m, int r) {
		/**
		 * 1. Find sizes of two subarrays to be merged
		 */

		int n1 = m - l + 1;
		int n2 = r - m;

		/**
		 * 2.Create temp arrays
		 */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/**
		 * 3.Copy data to temp arrays
		 */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/**
		 * 4. Merge the temp arrays
		 */

		/**
		 * 5. Initial indexes of first and second subarray
		 */
		int i = 0, j = 0;

		/**
		 * 6. Initial index of merged subarray array
		 */
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/**
		 * 7.Copy remaining elements of L[] if any
		 */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/**
		 * 8.Copy remaining elements of R[] if any
		 */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * 9.Main function that sorts arr[l..r] using merge()
	 * 
	 */
	void sort(int arr[], int l, int r) {
		if (l < r) {
			/**
			 * 10.Find the middle point
			 */
			int m = l + (r - l) / 2;

			/**
			 * 11. Sort first and second
			 */
			sort(arr, l, m);
			sort(arr, m + 1, r);

			/**
			 * 12.Merge the sorted
			 */
			merge(arr, l, m, r);
		}
	}

	/**
	 * 13.function to print array of size n
	 * 
	 * @param arr-to print sorted elemets
	 */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 90, 12, 17, 53, 45, 66, 37 };

		System.out.println("Given Array");
		/**
		 * 14.Printing a array
		 */
		printArray(arr);

		/**
		 * 15. creating object of method
		 */
		MergeSort ms = new MergeSort();
		/**
		 * 16.calling method in object
		 */
		ms.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		/**
		 * 17.printing merged and sorted array
		 */
		printArray(arr);
	}
}