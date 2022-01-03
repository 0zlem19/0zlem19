
public class Adim25 {

	public static final int N = 3;

	public static void main(String[] args) {

		int tekrar = 3;

		for (int line = N; line >= 1; line--) {
			for (int index = 0; index < tekrar; index++) {
				for (int j = 1; j <= (-1 * line + N); j++) {
					System.out.print(" ");
				}
				System.out.print("*");

				for (int i = 1; i <= 2 * line - 1; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 1; j <= (-1 * line + N); j++) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}