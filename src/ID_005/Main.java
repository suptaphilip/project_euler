package ID_005;

/**
 * What is the smallest number divisible by each of the numbers 1 to 20?
 */
public class Main {

	public static void main(String[] args) {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20 };

		System.out.println(calculateMin(values));
	}

	public static int calculateMin(int[] values) {
		int result = 1;
		for (int i = 0; i < values.length; i++) {

			int divisor = largestPrime(values[i]);
			values = divide(values, divisor);
			result = result * divisor;
		}
		return result;
	}

	public static int largestPrime(int d) {
		int MaxPrime = d;
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				MaxPrime = largestPrime(i);
			}
		}
		return MaxPrime;
	}

	public static int[] divide(int[] values, int d) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] % d == 0) {
				values[i] = values[i] / d;
			}
		}
		return values;
	}
}
