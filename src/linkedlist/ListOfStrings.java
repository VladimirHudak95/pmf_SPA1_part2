package linkedlist;

public class ListOfStrings {

	private Node first;
	private int size;
	
	public ListOfStrings () {
		this.first = null;
		this.size = 0;
	}
	
	private static class Node {
		
		private String info;
		private Node next;
		
		public Node (String info) {
			this.info = info;
			this.next = null;
		}
		
	}
	
	public int size () {
		return size;
	}
	
	public boolean isEmpty () {
		return size == 0;
	}
	
	public void add (String info) {
		Node n = new Node(info);
		n.next = first;
		first = n;
		size++;
	}
	
	public void print() {
		Node curr = first;
		while (curr != null) {
			System.out.println(curr.info);
			curr = curr.next;
		}
	}
	
	public void printAllElementsLongerThanThree() {
		Node curr = first;
		while (curr != null) {
			if (curr.info.length() > 3) {
				System.out.println(curr.info);
			}
			curr = curr.next;
		}
	}
	
	public void printLast() {
		if (first == null) {
			return;
		}
		Node curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		System.out.println(curr.info);
	}
	
	public int getNumberOfOccurrencesOfElements (String element) {
		int count = 0;
		
		Node curr = first;
		while (curr != null) {
			if (curr.info.equals(element)) {
				count++;
			}
			curr = curr.next;
		}
				
		return count;
	}
	
	public int numberOfElementsBeginningWithCapitalLetter() {
		Node curr = first;
		int count = 0;
		while(curr != null) {
			if(Character.isUpperCase(curr.info.charAt(0))) {
				count++;
			}
			curr = curr.next;
		}
		return count;
	}
	
	public double averageLengthOfElements() {
		int numberOfElements = 0;
		int elementLength = 0;
		Node curr = first;
		while(curr != null) {
			elementLength += curr.info.length();
			numberOfElements++;
			curr = curr.next;
		}
		return elementLength / numberOfElements;
	}
	
	public void removeElementsShorterThanPrevious() {
		
		if(first == null || first.next == null) {
			return;
		}
		
		Node prev = first;
		Node curr = first.next;
		while(curr != null) {
			if(curr.info.length() > prev.info.length()) {
				prev.next = curr.next;
				curr = curr.next;
				size--;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
	}
}
