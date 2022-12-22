package DLL;

public class DLL {

	private Node head;

	public DLL() {
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
		newNode.setPrev(last);
		return true;
	}

	public void display() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public boolean insertAtPosition(int data, int position) {

		Node newNode = new Node(data);

		if (position <= 0 && (head == null && position > 0)) {
			return false;
		}

		if (position == 1) {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		Node prev = head;

		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
		}

		newNode.setPrev(prev);

		if (prev.getNext() != null) {
			newNode.setNext(prev.getNext());
			prev.getNext().setPrev(newNode);
		}
		prev.setNext(newNode);
		return true;
	}

	public boolean deleteByposition(int position) {

		if (head == null) {
			return false;
		}

		if (position == 1) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}

		Node del = head;
		for (int i = 1; i < position; i++) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		del.getPrev().setNext(del.getNext());
		if (del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}

	public boolean deleteByValue(int data) {

		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}

		Node del = head;

		while (del.getData() != data) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		del.getPrev().setNext(del.getNext());
		if (del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}

}
