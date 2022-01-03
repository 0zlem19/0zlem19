
public class Adim26 {

	public static final int N = 15;

	public static void main(String[] args) {

		for (int line = N; line >= 1; line--) {

			for (int space = 1; space <= (-1 * line + N); space++) {
				System.out.print("*+");
			}
			System.out.println(line);
		}
		for (int line = 1; line <= N; line++) {

			for (int space = 1; space <= (-1 * line + N); space++) {
				System.out.print("*+");
			}
			System.out.println(line);
		}

	}

}
