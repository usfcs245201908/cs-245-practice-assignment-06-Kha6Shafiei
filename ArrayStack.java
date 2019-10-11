

public class ArrayStack<T> implements Stack <T>{
	protected int some_size = 10;
	protected int top;
	protected T[] a=  (T[]) new Object[some_size];

	
	
	public boolean empty() {
		
		return top < 0;
	}
	
	@Override
	public void push(T item) {
		if (top == a.length-1)
			throw new RuntimeException("Stack is full");
		a[++top] = item;
		
	}


	@Override
	public T pop() {
		if(empty())
			throw new IllegalArgumentException("Array is empty");
		
		return a[top--];
	}


	@Override
	public  T peek() {
		if(empty())
			throw new IllegalArgumentException("Array is empty");
		
		return a[top];
	}


}
