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
	public boolean remove(E e) {

		Node<E> curr = first;
		Node<E> prev = null;
		
		if (first != null && last != null && (first.info.equals(e) || last.info.equals(e))) {
			if(first.info.equals(e) && last.info.equals(e)) {
				first = null;
				last = null;
				size--;
				return true;
			} else if (first.info.equals(e)) {
				first = first.next;
				size--;
				return true;
			} else {
				while(curr.next != last) {
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
		
		if(isEmpty()) {
			return false;
		}
		
		Node<E> curr = first;
		
		while(curr != null) {
			if(curr.info.equals(e)) {
				return true;
			}
			curr = curr.next;
		}
		
		return false;
	}

	@Override
	public void clear() {
		if(isEmpty()) {
			return;
		}
		Node<E> prev = first;
		Node<E> curr = first.next;
		while(curr != null) {
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
	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		Node<E> curr = first;
		while(count != index) {
			curr = curr.next;
			count++;
		}
	
		return curr.info;
	}

	@Override
	public E set(int index, E element) {
		E oldValue = get(index);
		
		
		
		return oldValue;
	}

	@Override
	public void add(int index, E element) {

	}

	@Override
	public E remove(int index) {
		return null;
	}

}
