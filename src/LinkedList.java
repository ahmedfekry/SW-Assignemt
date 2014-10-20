class LinkedList<T> implements StackInterface<T> {

	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
	}

	public void push(T value) {
		Node<T> temp = new Node<T>();
		temp.data = value;
		temp.next = head;
		head = temp;
	}

	public void add_to_the_back(T value) {
		Node<T> temp = new Node<T>();
		temp.data = value;
		temp.next = null;
		tail = temp;
	}

	public T pop() {
		Node<T> temp = new Node<T>();
		T data_element = head.data;
		temp = head.next;
		head = temp;

		return data_element;
	}

	public T Top() {
		Node<T> temp = new Node<T>();
		temp = head;

		return temp.data;
	}

	public int length() {
		int count = 0;
		Node<T> temp = new Node<T>();
		temp = head;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean insert(T ele, int pos) {

		if (pos >= length() || pos <= 0)
			return false;

		Node<T> temp = new Node<T>();
		temp.data = ele;

		Node<T> prev = null;
		Node<T> cuur = head;

		for (int i = 0; i < pos; ++i) {
			prev = cuur;
			cuur = cuur.next;
		}

		temp.next = cuur;
		prev.next = temp;

		return true;
	}

	public boolean remove(T ele) {
		Node<T> curr = head;
		Node<T> prev = null;

		while (curr.next != null) {
			if (curr.data == ele) {
				prev.next = curr.next;
				curr = null;
				return true;
			}
			prev = curr;
			curr = curr.next;
		}
		return false;
	}

	public void display() {
		Node<T> temp = head;
		while (temp.next != null) {
			System.out.print(temp.data);
			System.out.print(" ");

			temp = temp.next;
		}
		System.out.print(temp.data);
	}

}
