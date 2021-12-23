import java.util.Scanner;

public class Adim17 {

	public static void main(String[] args) {

		System.out.println(" Üçgen kenarý kaç yýldýz olsun");
		Scanner scanner = new Scanner(System.in);
		int star = scanner.nextInt();
		String sonuc = "";

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - i; j++)
				System.out.print(" ");

			sonuc += "* ";
			System.out.print(sonuc + "\n");

		}
	}

}
