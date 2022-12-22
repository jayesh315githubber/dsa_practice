package queue;

public class Queue {

	private int front, rear;
	private int[] arr;

	public Queue() {
		front = -1;
		rear = -1;
		arr = new int[5];
	}

	public Queue(int size) {
		front = -1;
		rear = -1;
		arr = new int[size];
	}

	public boolean isFull() {

		if (rear == (arr.length - 1)) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		
		if(front == -1 || (front > rear)) {
			return true;
		}
		return false;
	}
	
	
	public void enqueue(int data) {
		
		if(isFull() == false) {
			rear = rear + 1;
			arr[rear] = data;
			if(front == -1) {
				front = 0;
			}	
			System.out.println("Enqueue"+data+" front "+front+" rear"+ rear);
		}
		else {
			System.out.println("Queue is Full..");
			
		}
	}
	
	public int dequeue() {
		
		if(isEmpty() == false) {
			
			int temp = arr[front];
			front = front + 1;
			System.out.println("Dequeue"+temp+" front "+front+" rear"+ rear);
			return temp;
			
		}else {
			System.out.println("Queue is Empty..");
			return Integer.MAX_VALUE;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
