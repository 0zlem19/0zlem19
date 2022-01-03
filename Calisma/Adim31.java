
import java.util.Scanner;

public class Adim31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Üç tane rasyonel sayı giriniz:");

		double sayi1 = input.nextDouble();
		double sayi2 = input.nextDouble();
		double sayi3 = input.nextDouble();

		double sonuc = maksimum(sayi1, sayi2, sayi3);
		System.out.println("En büyük sayı = " + sonuc);
	}

	public static double maksimum(double x, double y, double z) {

		double enbuyuk = x;

		if (y > enbuyuk)
			enbuyuk = y;

		if (z > enbuyuk)
			enbuyuk = z;
		return enbuyuk;
	}
}
