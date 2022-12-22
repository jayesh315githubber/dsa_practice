package binaryserchtree;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {
			if (data == temp.getData()) {
				return false;
			}

			if (data < temp.getData()) {

				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {

				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.getData() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrder(root.getRight());
	};

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() + " ");
	}

	public Integer getMax(Node root) {

		if (root == null) {
			return null;
		}

		Node temp = root;

		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getData();
	}

	public Integer getMin(Node root) {

		if (root == null) {
			return null;
		}

		Node temp = root;

		if (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	public boolean deleteNode(int data) {

		if (root == null) {
			return false;
		}

		Node parent = root, del = root;

		while (del.getData() != data) {

			parent = del;

			if (data < del.getData()) {
				del = del.getLeft();
			} else {
				del = del.getRight();
			}

			if (del == null) {
				return false;
			}
		}

		if (del.getLeft() == null && del.getRight() == null) {

			if (del == root) {
				root = null;
				return true;
			}

			if (del == parent.getLeft()) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
			return true;
		}

		return false;
	}

	public Integer getHeight(Node root) {

		if (root == null) {
			return 0;
		} else {
			int ldepth = getHeight(root.getLeft());

			int rdepth = getHeight(root.getRight());

			if (ldepth > rdepth) {
				return (ldepth + 1);
			} else {
				return (rdepth + 1);
			}
		}
	}

	public void printKDist(Node root, int k) {

		if (root == null) {
			return;
		}

		if (k == 0) {
			System.out.println(root.getData() + " ");
		} else {
			printKDist(root.getLeft(), k - 1);
			printKDist(root.getRight(), k - 1);
		}
	}

}
