
public class Adim33 {

	public static void main(String[] args) {

		int x = faktoriyel(7);
		System.out.println(x);
	}

	public static int faktoriyel(int n) {
		if (n == 1)
			return 1;

		else
			return n * faktoriyel(n - 1);

	}

}
