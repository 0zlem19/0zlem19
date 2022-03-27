import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");

		System.out.println("Sýralanmadan önce:" + words);
		System.out.println(words.get(0));
//		a-z ye sýralama
		Collections.sort(words);
		System.out.println("Sýralanmadan önce:" + words);
	}
}
