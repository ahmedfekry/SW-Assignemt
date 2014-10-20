import java.util.*;

public class Main {

	public static void main(String[] args) {
		StackInterface<Integer> stack = new StackArray<Integer>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.Top());
		stack.display();
		System.out.println("\n");

		StackInterface<Integer> stack2 = new LinkedList<Integer>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		System.out.println(stack2.pop());
		System.out.println(stack2.Top());
		stack2.display();
		// System.out.println("\n");

	}
}
