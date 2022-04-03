import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps2 {
	public static void main(String[] args) throws FileNotFoundException {
// hangi kelime , kaç defa ?
// döngü : 65 , return : 90 , for: 65

		Map<String, Integer> wordcountMap = new HashMap<String, Integer>();

		Scanner input = new Scanner(new File("test.txt"));

		while (input.hasNext()) {
			String word = input.next().toLowerCase();

			if (!wordcountMap.containsKey(word)) {
				wordcountMap.put(word, 1);
			} else {
				int count = wordcountMap.get(word);
				wordcountMap.put(word, count + 1);
			}
		}
		System.out.println(wordcountMap);

	}
}
