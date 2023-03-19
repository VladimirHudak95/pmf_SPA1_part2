package linkedlist;

public class SortedList {

	private Node first;
	private int size;
	
	public SortedList () {
		first = null;
		size = 0;
	}
	
	private static class Node {
		
		private int info;
		private Node next;
		
		public Node (int info) {
			this.info = info;
			this.next = null;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(int info) {
		Node n = new Node(info);
		if (first == null) {
			first = n;
			size++;
		} else if (info <= first.info) {
			n.next = first;
			first = n;
			size++;
		} else {
			Node curr = first;
			while (curr.next != null && curr.next.info <= info) {
				curr = curr.next;
			}
			n.next = curr.next;
			curr.next = n;
			size++;
		}
		
	}
	
	public void printSortedList() {
		if (first == null) {
			System.out.println("Empty list!");
			return;
		}
		System.out.print("List: [");
		Node curr = first;
		while (curr.next != null) {
			System.out.print(" " + curr.info + ", ");
			curr = curr.next;
		}
		System.out.print(curr.info + " ]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
