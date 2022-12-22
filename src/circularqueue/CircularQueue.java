package circularqueue;

public class CircularQueue {

	private int arr[];
	private int count;
	private int rear, front;

	public CircularQueue() {
		arr = new int[5];
		rear = front = -1;
		count = 0;
	}

	public CircularQueue(int s) {
		arr = new int[s];
		rear = front = -1;
		count = 0;
	}

	public boolean isFull() {

		if (count == arr.length) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public boolean enqueue(int data) {

		if (isFull() == false) {
			rear = (rear + 1) % arr.length;
			arr[rear] = data;
			if (front == -1) {
				front = 0;
			}
			//count = count + 1;
			count++;
			System.out.println("Enqueue " + data);
			return true;
		} else {
			System.out.println("Q is full..");
			return false;
		}
	}

	public int dequeue() {

		if (isEmpty() == false) {
			int temp = arr[front];
			front = (front + 1) % arr.length;
			//count = count - 1;
			count--;
			return temp;
		} else {
			System.out.println("Q is empty...");
			return Integer.MIN_VALUE;
		}
	}

}
