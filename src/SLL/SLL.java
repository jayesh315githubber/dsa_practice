package SLL;

public class SLL {

	private Node head;

	public SLL() {
		head = null;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;

		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	public boolean insertAtPosition(int data, int position) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}

		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		Node prev = head;

		for (int i = 0; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	public void display() {

		Node last = head;

		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getNext();
		}
	}

	public boolean deleteByPosition(int position) {

		if (position <= 0 || head == null) {
			return false;
		}

		if (position == 1) {
			head = head.getNext();
			return true;
		}

		Node prev = head;

		for (int i = 0; i < position - 1; i++) {
			prev = prev.getNext();
		}
		prev.setNext(prev.getNext().getNext());
		return true;
	}

	public boolean deleteByValue(int data) {

		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node del = head, prev = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();

			if (del == null) {
				return true;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

}
