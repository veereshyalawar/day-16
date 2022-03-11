import java.util.ArrayList;

	public class PrimeNumbersAnagram {

		/**
		 * PROCDURE:- 
		 * ========= 
		 * Extend the previous program to find the prime numbers that are Anagram and Palindrome.
		 * ======================================================================================= 
		 * 1.created two Array list 
		 * 2.giving input start range and end range 
		 * 3.printing a range
		 * 4.created method to check the number is prime or not 
		 * 5.created method to check whether given prime no. is palindrom and Anagram or not. 
		 * 6.Method to print prime number 
		 * 
		 * ==========================================================
		 */

		// 1.created a Arraylist
		static ArrayList<Integer> arrayList = new ArrayList<>();
		static ArrayList<Integer> arrayList2 = new ArrayList<>();

		public static void main(String[] args) {

			// 2.giving input start range and end range
			final int startRange = 0;
			final int endRange = 1000;

			// 3.printing a range
			primePrint(startRange, endRange);
		}

		/*
		 * 4. created method to check the number is prime or not
		 * 
		 * @param num-Number to be checked
		 * 
		 * @return- true if prime else false
		 */
		public static boolean isPrime(Integer num) {
			int flag = 0;
			if (num == 0 || num == 1)
				return false;
			for (int i = 2; i <= num; i++) {

				if (num % i == 0) {
					if (i == num) {

						/*
						 * After getting prime no. calling isPalindrom method to check whether number is
						 * palindrom or not and storing it into another arraylist
						 */
						isPalindrom(num);
						if (isPalindrom(num)) {
							arrayList2.add(num);
						}
					} else {
						return false;
					}
				}

			}
			return true;
		}

		// 5. Create a isPlaindrom method to check whether the prime no. is palindrom or
		// not
		public static boolean isPalindrom(Integer num) {
			int r, sum = 0;

			int orn = num;
			while (num > 0) {
				r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			if (orn == sum) {
				return true;
			} else {
				return false;
			}
		}

		/*
		 * 6.Method to print prime number
		 * 
		 * @param startRange-1
		 * 
		 * @param endRange-1000
		 */
		private static void primePrint(int startRange, int endRange) {
			System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " are :");
			for (int range = startRange; range <= endRange; range++) {
				if (isPrime(range)) {
					arrayList.add(range);
				}
			}
			System.out.println("Prime no : " + arrayList);
			System.out.println("\n\nPalindrom Prime no : " + arrayList2);
			System.out.println("\nIf a number is Palindrom then it is a Anagram number.");
		}
	}