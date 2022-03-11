import java.util.ArrayList;

	public class PrimeNumber {
		/**
		 * PROCDURE
		 *  Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
		 * ==========================================================
		 * 1.created a Array list
		 * 2.giving input start range and end range
		 * 3.printing a range
		 * 4. created method to check  the number is prime or not
		 * 5.Method to print prime number 
		 * ==========================================================
		 */
	
		/**
		 * 1.created a Array list
		 */
		static ArrayList<Integer> arrayList = new ArrayList<>();

		public static void main(String[] args) {
			/**
			 * 2.giving input start range and end range
			 */
			final int startRange = 0;
			final int endRange = 1000;
			/**
			 * 3.printing a range
			 */
			primePrint(startRange, endRange);
		}

		/**
		 * 4. created method to check the number is prime or not
		 * 
		 * @param num-Number to be checked
		 * @return- true if prime else false
		 */
		public static boolean isPrime(Integer num) {
			int flag = 0;
			if (num == 0 || num == 1)
				return false;
			for (int i = 2; i <= num / 2; ++i) {

				if (num % i == 0) {
					if(i== num) {
					return true;
				} else
					return false;
				}
			}

			return true;
		}

		/**
		 * 5.Method to print prime number
		 * 
		 * @param startRange-1
		 * @param endRange-1000
		 */
		private static void primePrint(int startRange, int endRange) {
			System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " are :");
			for (int range = startRange; range <= endRange; range++) {
				if (isPrime(range)) {
					arrayList.add(range);
				}
			}
			System.out.println(arrayList);
		}

	}