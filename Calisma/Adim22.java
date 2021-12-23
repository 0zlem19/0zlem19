import java.security.SecureRandom;

public class Adim22 {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();

		int[] sayi = new int[7];
		for (int a = 1; a <= 6; a++)
			sayi[a] = 0;

		int zar;
		for (int i = 1; i <= 6000000; i++) {
			zar = randomNumbers.nextInt(6) + 1;
			sayi[zar] = sayi[zar] + 1;
		}
		System.out.println("Yuz Sayi");
		for (int yuz = 1; yuz <= 6; yuz++)

			System.out.println(" " + yuz + " " + sayi[yuz]);
	}
}
