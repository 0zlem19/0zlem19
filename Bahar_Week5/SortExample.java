import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("kitap");

		System.out.println("S�ralanmadan �nce:" + words);
		System.out.println(words.get(0));
//		a-z ye s�ralama
		Collections.sort(words);
		System.out.println("S�ralanmadan �nce:" + words);
	}
}
