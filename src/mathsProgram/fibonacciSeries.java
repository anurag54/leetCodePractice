package mathsProgram;

public class fibonacciSeries {
	public static void main(String[] args) {
		int n = 10; // Number of terms in the Fibonacci series
		int first = 0, second = 1;
		System.out.print("Fibonacci Series up to " + n + " terms: ");
		for (int i = 1; i <= n; ++i) {
			System.out.print(first + " ");
			// Compute the next term
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
