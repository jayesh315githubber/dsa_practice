package circularqueue;

public class circularqueueTester {
	
	public static void main(String[] args) {
		
		
		CircularQueue cq = new CircularQueue(5);
		
		cq.enqueue(10);
		cq.enqueue(11);
		cq.enqueue(12);
		cq.enqueue(13);
		cq.enqueue(14);
//		cq.enqueue(15);
		
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
	}
	
	
}
