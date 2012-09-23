package ID_003;

import java.util.Scanner;

/**
 * Find the largest prime factor a composite number.
 * 
 * The integer n is composite if and only if there exists an integer a such that
 * a|n and 1<a<n
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String theLine = scan.nextLine();
			if (theLine.equals("")) {
				break;
			}
			Scanner scanner = new Scanner(theLine);
			while (scanner.hasNext()) {
				int compositeN = scanner.nextInt();
				if (compositeN == 1) {
					System.out.println("No prime factors.");
				} else {
					int divisor = largestDivisor(compositeN);

					System.out.println(getPrimeFact(divisor));
				}
			}
		}
	}

	public static int largestDivisor(int compositeN) {
		int divisor = 1;

		for (int i = 2; i < compositeN / 2; i++) {
			if (compositeN % i == 0) {
				divisor = i;
			}
		}
		return divisor;
	}

	public static int getPrimeFact(int d) {
		int maxPrime = 2;
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				maxPrime = i;
			}
		}
		if (maxPrime != 2) {
			return maxPrime;
		}
		return d;
	}
}
