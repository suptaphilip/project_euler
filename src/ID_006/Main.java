package ID_006;

import java.util.Scanner;

/**
 * What is the difference between the sum of the squares and the square of the
 * sums?
 */

public class Main {

	public static void main(String[] args) {
		// System.out.println();

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String theLine = scan.nextLine();
			if (theLine.equals("")) {
				break;
			}
			Scanner scanner = new Scanner(theLine);
			while (scanner.hasNext()) {
				int upperBound = scanner.nextInt();
				System.out.println(SquareofSum(upperBound)
						- SumofSquares(upperBound));
			}

		}

	}

	public static int SumofSquares(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + (i * i);
		}
		return result;
	}

	public static int SquareofSum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		result = result * result;
		return result;
	}

}
