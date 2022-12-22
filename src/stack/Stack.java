package stack;

public class Stack {

	private int arr[];
	private int top, size;

	public Stack() {
		size = 10;
		arr = new int[size];
		top = -1;
	}

	public Stack(int s) {
		size = s;
		arr = new int[size];
		top = -1;
	}

	public boolean isFull() {

		if (top == (size - 1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean push(int data) throws Exception {

		if (isFull() == false) {
			top = top + 1;
			arr[top] = data;
			return true;
		} else {
//			return false;
			throw new Exception("Stack is Full.");
		}
	}

	public Integer pop() throws Exception {

		if (isEmpty() == false) {
			int temp = arr[top];
			top = top - 1;
			return temp;
		} else {
//			return Integer.MAX_VALUE;
			throw new Exception("Stack is empty.");
		}
	}

	public Integer peek() throws Exception {

		if (isEmpty() == false) {
			return arr[top];
		} else {
//			System.out.println("Stack is empty");
//			return Integer.MIN_VALUE;
			throw new Exception("Stack is empty.");
		}
	}

}
