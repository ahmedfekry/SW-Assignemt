/**
 * 
 * @author Ahmed Mohammed Fekry this is the interface for the stack
 * @param <T>
 */
public interface StackInterface<T> {
	void push(T element);

	T pop();

	T Top();

	void display();
}
