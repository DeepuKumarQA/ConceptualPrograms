package conceptProgramming;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int n, Sqrt;
		System.out.println("Enter the number to find the squareroot: ");
		try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
		}
		Sqrt = n * n;
		System.out.println("The square root of the number is : " + Sqrt);
	}

}
