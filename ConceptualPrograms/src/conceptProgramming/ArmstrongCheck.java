package conceptProgramming;

import java.util.Scanner;

public class ArmstrongCheck {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Number to check: ");
		try (Scanner in = new Scanner(System.in)) {
			num = in.nextInt();
		}
		int check = 0;
		int remainder;
		int a = num;

		while (num > 0) {
			remainder = num % 10;
			check = (int) (check + Math.pow(remainder, 3));
			num = num / 10;
		}
		if (check == a) {
			System.out.println("This is Armstrong Number");
		} else {
			System.out.println("This is not Armstrong Number");
		}
	}

}
