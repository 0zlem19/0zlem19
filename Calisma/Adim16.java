public class Adim16 {
	public static final int HEIGHT = 7;
	public static final int SEGMENT = 3;

	public static void main(String[] args) {
		for (int i = 1; i <= SEGMENT; i++) {
			for (int line = 1; line <= HEIGHT; line++) {

				for (int space = 1; space <= HEIGHT - line; space++) {
					System.out.print(" ");
				}
				for (int star = 1; star <= 2 * line - 1; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
