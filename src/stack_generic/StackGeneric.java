package stack_generic;

public class StackGeneric<T> {

	private T arr[];
	private int top, size;

	public StackGeneric() {
		size = 5;
		top = -1;
		arr = (T[]) new Object[size];
	}

	public StackGeneric(int size) {
		this.size = size;
		top = -1;
		arr = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public boolean push(T data) {

		if (isFull()) {
			return false;
		}
		top = top + 1;
		arr[top] = data;
		return true;
	}

	public T pop() {

		if (isEmpty()) {
			return null;
		}
		return arr[top--];

	}

	public T peek() {
		return arr[top];
	}

}
