import java.security.SecureRandom;

public class Adim32 {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int zar;
		for (int i = 0; i < 100; i++) {
			zar = random.nextInt(6) + 1;
			System.out.print(zar + " ");
			if (i % 10 == 0)
				System.out.println();

		}

	}
}
