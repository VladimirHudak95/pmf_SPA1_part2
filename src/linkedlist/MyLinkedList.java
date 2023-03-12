package linkedlist;

public class MyLinkedList<E> implements MyList<E> {

	private int size;
	private Node<E> first;
	private Node<E> last;

	public MyLinkedList() {
		this.size = 0;
		this.first = null;
		this.last = null;
	}
	
	public MyLinkedList(E[] array) {
		this();
		this.addFromArray(array);
	}
	
	public MyLinkedList(MyLinkedList<E> newList) {
		this();
		this.addFromList(newList);
	}

	private static class Node<E> {
		private E info;
		private Node<E> next;

		Node(E info, Node<E> next) {
			this.info = info;
			this.next = next;
		}

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void print() {
		if (first == null) {
			System.out.println("Empty list!");
			return;
		}
		Node<E> curr = first;
		while (curr != null) {
			System.out.println(curr.info);
			curr = curr.next;
		}
	}

	@Override
	public boolean add(E e) {
		final Node<E> n = new Node<E>(e, null);
		if (first == null) {
			first = n;
			last = n;
			size++;
		} else {
			n.next = first;
			first = n;
			size++;
		}
		return true;
	}

	@Override
	public boolean addBehindLast(E e) {
		final Node<E> n = new Node<E>(e, null);
		if (first == null) {
			first = n;
			last = n;
			size++;
		} else {
			last.next = n;
			last = n;
			size++;
		}
		return true;
	}

	@Override
	public boolean remove(E e) {

		Node<E> curr = first;
		Node<E> prev = null;

		if (first != null && last != null && (first.info.equals(e) || last.info.equals(e))) {
			if (first.info.equals(e) && last.info.equals(e)) {
				first = null;
				last = null;
				size--;
				return true;
			} else if (first.info.equals(e)) {
				first = first.next;
				size--;
				return true;
			} else {
				while (curr.next != last) {
					curr = curr.next;
				}
				last = curr;
				curr.next = null;
				size--;
				return true;
			}
		}

		while (curr != null) {
			if (curr.info.equals(e)) {
				prev.next = curr.next;
				curr.next = null;
				size--;
				return true;
			}
			prev = curr;
			curr = curr.next;
		}

		return false;
	}

	@Override
	public boolean contains(E e) {

		if (isEmpty()) {
			return false;
		}

		Node<E> curr = first;

		while (curr != null) {
			if (curr.info.equals(e)) {
				return true;
			}
			curr = curr.next;
		}

		return false;
	}

	@Override
	public void clear() {
		if (isEmpty()) {
			return;
		}
		Node<E> prev = first;
		Node<E> curr = first.next;
		while (curr != null) {
			prev.info = null;
			prev.next = null;
			prev = curr;
			curr = curr.next;
			size--;
		}
		prev.info = null;
		prev.next = null;
		size--;

		first = null;
		last = null;
	}

	@Override
	public E getFirst() {
		if (!isEmpty()) {
			return first.info;
		}
		return null;
	}

	@Override
	public E getLast() {
		if (!isEmpty()) {
			return last.info;
		}
		return null;
	}

	@Override
	public E get(int index) {
		if (isIndexOutOfRange(index)) {
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		Node<E> curr = first;
		while (count != index) {
			curr = curr.next;
			count++;
		}

		return curr.info;
	}

	private Node<E> getNode(int index) {

		Node<E> node = first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	@Override
	public E set(int index, E element) {
		if (isIndexOutOfRange(index)) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> node = getNode(index);
		E oldValue = node.info;
		node.info = element;

		return oldValue;
	}

	@Override
	public void add(int index, E element) {
		if (isPositionOutOfRange(index)) {
			throw new IndexOutOfBoundsException();
		}
		final Node<E> node = new Node<E>(element, null);
		if (index == 0) {
			node.next = first;
			first = node;
			size++;
		} else if (index == size) {
			last.next = node;
			last = node;
			size++;
		} else {
			Node<E> prev = first;
			for (int i = 1; i < index; i++) {
				prev = prev.next;
			}
			node.next = prev.next;
			prev.next = node;
			size++;
		}
	}

	@Override
	public E remove(int index) {
		if (isIndexOutOfRange(index)) {
			throw new IndexOutOfBoundsException();
		}
		if (size == 1) {
			E info = first.info;
			first = null;
			last = null;
			size--;
			return info;
		}
		if (index == 0) {
			final E info = first.info;
			first = first.next;
			size--;
			return info;
		} else if (index == size - 1) {
			final E info = last.info;
			Node<E> prev = getNode(index - 1);
			last = prev;
			last.next = null;
			size--;
			return info;
		} else {
			final Node<E> prev = getNode(index - 1);
			final E info = prev.next.info;
			prev.next = prev.next.next;
			size--;
			return info;
		}
	}
	
	public void reverse() {
		if (size == 0 || size == 1) {
			return;
		}
		
		Node<E> old = null;
		Node<E> curr = first;
		Node<E> next = first.next;
		last = first;
		while(curr.next != null) {
			curr.next = old;
			old = curr;
			curr = next;
			next = next.next;
		}
		curr.next = old;
		first = curr;
	}
	
	public MyLinkedList<E> splitFirstN(int n) {
		if (isPositionOutOfRange(n)) {
			throw new IndexOutOfBoundsException();
		}
		MyLinkedList<E> newList = new MyLinkedList<>();
		if (n == 0) {
			return newList;
		}
		if (n == size) {
			newList.first = first;
			newList.last = last;
			newList.size = size;
			first = null;
			last = null;
			size = 0;
			return newList;
		}
		
		newList.first = first;
		newList.size++;
		size--;
		
		Node<E> curr = newList.first;
		while(newList.size < n) {
			curr = curr.next;
			newList.size++;
			size--;
		}
		newList.last = curr;
		this.first = curr.next;
		curr.next = null;
		return newList;
	}
	
	public MyLinkedList<E> splitOddIndexes() {
		MyLinkedList<E> oddList = new MyLinkedList<>();
		if (first == null || first.next == null) {
			return oddList;
		}
		Node<E> curr = first;
		Node<E> oddCurr = first.next;
		oddList.first = oddCurr;
	
		if (size % 2 != 0) {
			Node<E> oldOddCurr = null;
			while (oddCurr != null) {
				oldOddCurr = oddCurr;
				curr.next = oddCurr.next;
				size--;
				oddList.size++;
				curr = curr.next;
				oddCurr.next = curr.next;
				oddCurr = oddCurr.next;
			}
			oddList.last = oldOddCurr;
		} else {
			Node<E> oldCurr = null;
			while (curr != null) {
				oldCurr = curr;
				curr.next = oddCurr.next;
				size--;
				oddList.size++;
				curr = curr.next;
				if (oddCurr.next != null) {
					oddCurr.next = curr.next;
					oddCurr = oddCurr.next;
				}
			}
			oddList.last = last;
			last = oldCurr;
		}
		
		return oddList;
		
	}
	
	public  Object[] toArray() {
		Object[] array = new Object [size];
		int i = 0;
		Node<E> curr = first;
		while(curr != null) {
			array[i++] = curr.info;
			curr = curr.next;
		}
		return array;
	}
	
	public void addFromArray(E[] array) {
		for(E e : array) {
			addBehindLast(e);
		}
	}
	
	public void addFromList(MyLinkedList<E> newList) {
		Node<E> curr = newList.first;
		while(curr != null) {
			addBehindLast(curr.info);
			curr = curr.next;
		}
	}
	
	private boolean isIndexOutOfRange(int index) {
		return index < 0 || index >= size;
	}
	
	private boolean isPositionOutOfRange(int position) {
		return position < 0 || position > size;
	}

}
