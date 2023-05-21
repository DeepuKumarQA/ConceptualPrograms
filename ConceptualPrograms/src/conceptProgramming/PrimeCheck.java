package conceptProgramming;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int n, i = 1, count = 0;
		System.out.println("Enter the number to check: ");
		try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
		}
		while (i <= n) {
			if (n % i == 0) {
				count = count + i;
				i = i + 1;
			}
			if (count == 2) {
				System.out.println("Entered number is prime");
			} else {
				System.out.println("Entered number is not prime");
			}
		}
	}

}
// not giving correct answer