package ID_001;

import java.util.Scanner;

/**
 * @class ID_001
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String theLine = scan.nextLine();
			if (theLine.equals("")) {
				break;
			}
			Scanner scanner = new Scanner(theLine);
			while (scanner.hasNext()) {
				System.out.println(sum(scanner.nextInt()));
			}
		}
	}

	/**
	 * Sums the natural numbers that are factors of 3 or 5
	 * 
	 * @param maxValue
	 *            number of numbers
	 * @return sum sum of numbers less than maxValue
	 */
	public static int sum(int maxValue) {
		int sum = 0;

		for (int i = 1; i < maxValue; i++) {

			if (i % 5 == 0 || i % 3 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
