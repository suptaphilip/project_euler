package ID_007;

/**
 * Find the 10001st prime.
 */

public class Main {

	public static void main(String[] args) {
		// System.out.println()
		int counter = 0;
		int primeN = 2;

		for (int i = 1; i <= 200000; i++) {
			while (counter < 1001) {
				if (isPrime(i)) {
					primeN = i;
					counter++;
				}
				break;
			}
		}
		System.out.print(counter + " ");
		System.out.println(primeN);

	}

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
