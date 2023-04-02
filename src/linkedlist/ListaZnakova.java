package linkedlist;

public class ListaZnakova {

	private Node first;
	private int count;
	
	private static class Node {
		
		private char info;
		private Node next;
		
		public Node(char info) {
			this.info = info;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return "" + info;
		}
		
	}
	
	public ListaZnakova() {
		this.first = null;
		this.count = 0;
	}
	
	public void add(char info) {
		Node n = new Node(info);
		n.next = first;
		first = n;
		count++;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}
	
	public void printUpperCaseLetters() {
		if(first == null) {
			return;
		}
		Node curr = first;
		while(curr != null) {
			if(curr.info >= 'A' && curr.info <= 'Z') {
				System.out.println(curr);
			}
			curr = curr.next;
		}
	}
	
	public void removeAllLowerCaseLetters() {
		while(first != null && isLowerCase(first.info)) {
			first = first.next;
			count--;
		}
		if(first == null) {
			return;
		}
		
		Node prev = first;
		Node curr = first.next;
		while(curr != null) {
			if(isLowerCase(curr.info)) {
				prev.next = curr.next;
				curr = prev.next;
				count--;
				continue;
			}
			prev = curr;
			curr = curr.next;
		}
	}
	
	public ListaZnakova splitNumbersIntoNewList() {
		ListaZnakova newList = new ListaZnakova();
		Node prev = null;
		Node curr = this.first;
		Node newListCurr = null;
		int counter = 0;
		
		while(curr != null && isNumber(curr.info)) {
			prev = curr;
			curr = curr.next;
			counter++;
		}
		
		if(curr == null) {
			newList.first = this.first;
			newList.count = this.count;
			this.first = null;
			this.count = 0;
			return newList;
		}
		
		if(curr != this.first) {
			newList.first = this.first;
			newList.count += counter;
			newListCurr = prev;
			this.first = curr;
			this.count -= counter;
		}
		prev = curr;
		curr = curr.next;
			
		while(curr != null) {
			if(isNumber(curr.info)) {
				if(newListCurr == null) {
					newListCurr = curr;
					newList.first = curr;
				} else {
					newListCurr.next = curr;
					newListCurr = newListCurr.next;
				}
				newList.count++;
				this.count--;
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
				
		}
		if(newListCurr != null) {
			newListCurr.next = null;
		}
		return newList;
	}
	
	private boolean isLowerCase(char info) {
		return info >= 'a' && info <= 'z';
	}
	private boolean isNumber(char info) {
		return info >= '0' && info <= '9';
	}
	
	@Override
	public String toString() {
		String result = "List [ ";
		
		if(first == null) {
			result += "]";
			return result;
		}
		
		Node curr = first;
		while(curr.next != null) {
			result += curr.info + ", ";
			curr = curr.next;
		}
		
		result += curr.info + " ]";
		
		return result;
	}
	
}
