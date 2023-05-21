package conceptProgramming;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number to check: ");
		try (Scanner in = new Scanner(System.in)) {
			num = in.nextInt();
		}
		if (num % 2 == 0) {
			System.out.println("Entered number is Even");
		} else {
			System.out.println("Entered number is odd");
		}
	}

}
