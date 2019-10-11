
public class ArrayQueue <T> implements Queue <T>{
	
	protected T[] a;
	protected int front = 0;
	protected int back = 0;
	protected int some_size = 10;

	
	public T dequeue() {
		if(empty()) throw new IllegalArgumentException("Array is empty");
		T item = a[front];
		front = (front + 1) % a.length;
		return item;
		
	}

	
	public void enqueue(T item) {
		if (isFull())
			grow_array();
		if (back == a.length-1) // deal with circular case
			back = -1;
		
		a[++back] = item;

	}
		
	public boolean isFull() {
		return numOfItems == a.length;
	}

	
	public boolean empty() {
		if(front == back) {
			return true;
		}
		return false;
	}

	protected void grow_array() {
		T[] new_a = new T [a.length*2];
        for(int i=0;i<some_size;i++){
            new_a[i] = a[i];
        }
        a = new_a;
        some_size = some_size*2;
	}

}
