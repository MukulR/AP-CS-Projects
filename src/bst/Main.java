package bst;

public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.insert(7);
		bsti.insert(19);
		bsti.insert(4);
		bsti.insert(20);
		bsti.insert(18);
		// If printed in order, the below line should produce 7, 12, 19
		System.out.println(bsti);
		System.out.println("Number of Nodes: " + bsti.countNodes());
		bsti.printInOrder();
		System.out.println("");
		System.out.println(bsti.depth());
	}

}
