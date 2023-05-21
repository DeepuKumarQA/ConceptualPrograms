package conceptProgramming;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, reverse = 0;

		System.out.println("Enter the string to check: ");
		try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
		}
		int z = n;

		while (n > 0) {
			reverse = (reverse * 10) + n % 10;
			n = n / 10;

		}
		if (reverse == z) {
			System.out.println("Entered string is palindrome");
		} else {
			System.out.println("Entered string is not palindrome");
		}

	}

}
