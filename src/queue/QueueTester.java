package queue;

public class QueueTester {

	public static void main(String[] args) {

		Queue qtest = new Queue(0);
		
		Queue q = new Queue(5);
		
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(30);
		q.enqueue(40);

		System.out.println("completed!!");
	}
}
