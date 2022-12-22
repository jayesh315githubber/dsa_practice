package stack;

public class StackTester {

	public static void main(String[] args) throws Exception {

		Stack s1 = new Stack();
		// push 10,20,50,40
		s1.push(10);
		s1.push(20);
		s1.push(50);
		s1.push(40);
		// pop --> what will be sequence of output?
//		int element = s1.pop();
//		System.out.println("Poped element is ->" + element);
//		element = s1.pop();
//		System.out.println("Poped element is ->" + element);
//		element = s1.pop();
//		System.out.println("Poped element is ->" + element);
//		element = s1.pop();
//		System.out.println("Poped element is ->" + element);

		int element = s1.peek();
		System.out.println("peek element is  -> " + element);

	}

}
