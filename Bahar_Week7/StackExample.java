import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {

		String[] data = { "java", "php", "pyhton", "C", "C++" };

		Stack<String> s = new Stack<String>();
//	Set ->add
//	Map ->put
//	push,pop,peek

		for (String word : data) {
			s.push(word);
		}
//	peek,pop,push,size,isEmpty
		System.out.println("Stack =" + s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack =" + s);
		System.out.println("----------");
		while (!s.isEmpty()) {
			System.out.println(s.pop());
			System.out.println("Stack =" + s);
		}

	}
}
