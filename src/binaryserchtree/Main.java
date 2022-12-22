package binaryserchtree;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(50);
		bst.insert(30);
		bst.insert(80);
		bst.insert(20);
		bst.insert(40);
		bst.insert(35);
		bst.insert(60);
		bst.insert(100);
		bst.insert(70);

		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.postOrder(bst.getRoot());

		System.out.println();
		bst.inOrder(bst.getRoot());

		System.out.println();
		System.out.println(bst.getMax(bst.getRoot()));

		System.out.println();
		System.out.println(bst.getMin(bst.getRoot()));

		System.out.println();
		bst.deleteNode(35);

		System.out.println();
		bst.preOrder(bst.getRoot());

		System.out.println();
		System.out.println(bst.getHeight(bst.getRoot()));

		System.out.println();
		bst.printKDist(bst.getRoot(), 2);

	}

}
