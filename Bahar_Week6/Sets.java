import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<String>();

		lists.add("kalem");
		lists.add("masa");
		lists.add("bilgisayar");
		lists.add("defter");
		lists.add(3, "dolap");
		lists.add("kalem");
		lists.add("masa");

		System.out.println(lists);
		System.out.println(lists.size());

		Set<String> sets = new HashSet<String>();

		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("kalem");
		sets.add("masa");

		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));

		sets.clear();
		System.out.println(sets);
		sets.addAll(lists);
		System.out.println(sets);
		System.out.println(lists.get(2));
		System.out.println(lists.get(4));
	}
}
