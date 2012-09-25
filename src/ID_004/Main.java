package ID_004;

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Main {

	public final static int max = 999;

	public static void main(String[] args) {
		int n = max;

		while (n > 0) {
			int temp = getProduct(n);
			if (temp != 0) {
				System.out.println(temp);
				break;
			} else {
				n--;
			}
		}
	}

	public static int getProduct(int n) {

		int result = 0; // is acting like a boolean

		for (int i = max; i >= n; i--) {
			int product = n * i;

			if (isPalidrome(product)) {
				return product;
			}
		}
		return result;
	}

	public static boolean isPalidrome(int p) {

		String stringNumber = String.valueOf(p);
		int length = stringNumber.length();

		char[] array = new char[length];
		char[] yarra = new char[length];

		for (int i = 0; i < length; i++) {

			array[i] = stringNumber.charAt(i);
			yarra[length - (i + 1)] = array[i];
		}

		for (int i = 0; i < length; i++) {

			if (array[i] != yarra[i]) {
				return false;
			}
		}
		return true;
	}
}