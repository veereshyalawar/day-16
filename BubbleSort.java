import java.util.ArrayList;
import java.util.Scanner;
/**
 * PROCEDURE:
 * =============================================
 * 1. Created method to bubble sort
 * 2.created object of class
 * 3.3.creating random array
 * 4.creating loop to print the array
 * 5.calling method to bubble sort a array
 * 6.creating loop to print the sorted array
 * ==============================================
 */

public class BubbleSort {

	/**
	 * 1. Created method to bubble sort
	 * 
	 * @param args
	 */
	public void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		/**
		 * 2.created object of class
		 */
		BubbleSort b = new BubbleSort();
		/**
		 * 3.creating random array
		 */
		int arr[] = { 4, 60, 35, 2, 45, 120, 5 };

		System.out.println("Array Before Bubble Sort");
		/**
		 * 4.creating loop to print the array
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");

		/**
		 * 5.calling method to bubble sort a array
		 */
		b.bubbleSort(arr);

		System.out.println("Array After Bubble Sort");
		/**
		 * 6.creating loop to print the sorted array
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}