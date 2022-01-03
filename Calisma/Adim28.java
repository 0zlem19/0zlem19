import java.util.Scanner;

public class Adim28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Pascal ��geninin y�ksekli�ini giriniz: ");

		int length = sc.nextInt();
		int[][] triangle = new int[length][];
		System.out.println(" ");

		for (int row = 0; row < triangle.length; row++) {
			triangle[row] = new int[row + 1];
			triangle[row][0] = 1;
			triangle[row][row] = 1;

			for (int column = 1; column < row; column++) {
				triangle[row][column] = triangle[row - 1][column - 1] + triangle[row - 1][column];

			}

		}

		for (int row = 0; row < triangle.length; row++) {
			for (int column = 0; column < triangle[row].length; column++) {

				System.out.print(triangle[row][column] + " ");
			}
			System.out.println();
		}
	}

}
