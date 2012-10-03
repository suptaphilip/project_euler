package ID_009;

/**
 * Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.
 */

public class Main {
	static int counter = 1;

	public static void main(String[] args) {
		boolean isTriplet = false;
		while (!isTriplet) {

			double radical = (Math.sqrt((counter * counter) + 2000));
			int integer = (int) radical;
			double dbl = Double.parseDouble(String.valueOf(integer));

			if (dbl == radical) {

				int n = counter;
				int m = (int) (((-(counter)) + integer) / 2);
				if (m < 0) {
					m = (int) (((-(counter)) - integer) / 2);
					if (Product(n, m) > 0) {
						isTriplet = true;
						System.out.println(Product(n, m));
					}
				}
				if (Product(n, m) > 0) {
					isTriplet = true;
					System.out.println(Product(n, m));
				}
			}
			counter++;
		}
	}

	public static int Product(int n, int m) {
		int a = (m * m) - (n * n);
		int b = 2 * m * n;
		int c = (m * m) + (n * n);

		if (a + b + c == 1000) {
			return a * b * c;
		}
		return 0;
	}
}
