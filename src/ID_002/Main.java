package ID_002;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 */
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		int calcFib = 0;

		for (int i = 2; calcFib < 4000000; i++) {
			calcFib = fib(i - 1);

			if (calcFib % 2 == 0) {
				sum = sum + calcFib;
			}
		}
		System.out.println(sum);
	}

	public static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
