import java.util.Scanner;

public class Ozlem_Cetinkaya_Uygulama5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Bir kelime giriniz: ");
		String inputStr = sc.nextLine();

		System.out.println(" Bir sayý giriniz: ");
		int inputInt = sc.nextInt();

		splitter(inputStr, inputInt);

	}

	public static void splitter(String Str, int n) {
		int index = 0;
		for (int i = 0; i < Str.length() / n; i++) {
			System.out.println(Str.substring(index, index + n));
			index = index + n;
		}
		System.out.println(Str.substring(index, Str.length()));
	}

}
