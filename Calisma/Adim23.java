import java.util.Scanner;

public class Adim23 {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		int[] sayi = new int[6];
		for (int a = 1; a < 6; a++)
			sayi[a] = 0;

		System.out.println(" Anket notunuzu giriniz: ");
		int not = inputScanner.nextInt();
		while (not != -1) {
			sayi[not]++;
			System.out.println(" Anket notunuzu giriniz: ");
			not = inputScanner.nextInt();
		}
		System.out.println();
		System.out.println(" Not Sayi");
		for (int i = 1; i < 6; i++)
			System.out.println(" " + i + " " + sayi[i]);
	}

}
