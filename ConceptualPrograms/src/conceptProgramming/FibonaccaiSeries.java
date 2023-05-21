package conceptProgramming;

public class FibonaccaiSeries {

	public static void main(String[] args) {
		int i, n1 = 0, n2 = 1, count = 10;
		int n3;
		for (i = 2; i <= count; i++) {
			n3 = (n1 + n2);
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
