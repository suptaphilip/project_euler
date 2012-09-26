package ID_003;

import java.util.Scanner;

/**
 * Find the largest prime factor a composite number.
 * 
 */

public class Main {

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
					System.out.println(getPrimeFact(compositeN));
				}
			}
		}
	}

	public static int getPrimeFact(int d) {
		int MaxPrime = d;
		for (int i = 2; i < d; i++) {
			if (d % i == 0) {
				MaxPrime = getPrimeFact(i);
			}
		}
		return MaxPrime;
	}
}
