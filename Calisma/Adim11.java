import java.util.Scanner;

public class Adim11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dizinin kaç elemanlý olsun: ");
		int diziUzunluk = scanner.nextInt();
		scanner.nextLine();

		String[] isimler = new String[diziUzunluk];

		for (int i = 0; i < isimler.length; i++) {

			System.out.println("Dizinin" + (i) + ". index deðerini giriniz: ");
			isimler[i] = scanner.nextLine();
		}
		System.out.println("------DÝZÝNÝN ELEMANLARI------");
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(isimler[i]);
		}

	}

}
