package bst;

public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(BST<T> tree) {
		left = tree;
	}

	public void setRight(BST<T> tree) {
		right = tree;
	}
	
	public void insert(T datum) {
		if(datum.compareTo(this.datum) < 0) {
			if (getLeft() == null) {
				setLeft(new BST<T>(datum));
			} else {
				left.insert(datum);
			}
		} else if (datum.compareTo(this.datum) > 0) {
			if (getRight() == null) {
				setRight(new BST<T>(datum));
			} else {
				right.insert(datum);
			}
		}
	}
	
	public int countNodes() {
		return 1 + (left == null ? 0 : left.countNodes()) + (right == null ? 0 : right.countNodes());
	}
	
	public int depth() {
		return Math.max((left == null ? 0 : left.countNodes()), (right == null ? 0 : right.countNodes()));
	}
	
	public void printInOrder() {
		if(left != null) {
			left.printInOrder();
		}
		System.out.print(datum + ", ");
		if(right != null) {
			right.printInOrder();
		}
	}
	
	
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
}
