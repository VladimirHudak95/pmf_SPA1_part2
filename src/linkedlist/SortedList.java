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
	
	public void add(int info) {
		if (first == null) {
			Node n = new Node(info);
			first = n;
			size++;
		} else if (info < first.info) {
			
		}
	}
	
}
