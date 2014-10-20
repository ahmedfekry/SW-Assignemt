
class StackArray<T> implements StackInterface <T>{

	private final int size;
	private int top;
	private T[] array;
			
	public StackArray() {
		this(1001);
	}
	
	public StackArray(int si){
		if(si > 0)
			size = si;
		else
			size = 1001;
			
			top = -1;
	array  = (T[]) new Object[size]; 	
	}
	
	public void push(T element){
		if (top == size-1)
			System.out.println("Stack is Full cannot push the element");
		else
			array[++top] = element;
	}

	public T pop(){
		if (top == -1)
			System.out.println("Stack is Empity cann't pop the element");
		
		
		return array[top--]; 	
	}
	
	public	T Top()
    {
		T re = null;
        if(top != -1)
            re = array[top];
        else
            System.out.println("NO");
        
        return re;
    }

	public void display(){
		for(int i = top; i >= 0; i--){
			System.out.println(array[i]);
		}
	}
}









