package ID_008;

/**
 * Find the greatest product of five consecutive digits in the 1000-digit
 * number.
 */

public class Main {
	static int tupleL = 5;
	static int nDigits = 1000;

	public static void main(String[] args) {
		int[] digits = fill();
		int max = MultiplyRuns(digits);

		System.out.println(max);
	}

	public static int[] fill() {
		int[] digits = new int[nDigits];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = (int) (Math.random() * 10);
		}
		return digits;
	}

	public static int MultiplyRuns(int[] digits) {
		int max = 0;
		int temp = 0;
		int end = digits.length - tupleL;

		for (int i = 0; i < end; i++) {
			temp = digits[i] * (digits[i + 1]) * (digits[i + 2])
					* (digits[i + 3]) * (digits[i + 4]);
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}
}
