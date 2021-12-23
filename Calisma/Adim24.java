public class Adim24 {

	public static void main(String[] args) {

		int[][] a = new int[3][4];
		int[][] b = new int[5][5];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				a[i][j] = i + j;

		System.out.println(" Dizi1: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; i < 4; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		System.out.println();

		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i][j] = x;
				x = 1 - x;
			}
		}
		System.out.println(" Dizi2: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}
