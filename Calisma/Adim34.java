public class Adim34 {

	public static void main(String[] args) {

		int x = fibonacci(13);
		System.out.println(x);
	}

	public static int fibonacci(int n) {
		if (n <= 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);

	}

}
