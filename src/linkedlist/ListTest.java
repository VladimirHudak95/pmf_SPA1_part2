package linkedlist;

public class ListTest {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for(int i = 0; i < 50; i++) {
			list.add(i);
		}
		
		list.print();
		
		MyLinkedList<Integer> first10ElementsList = list.splitFirstNElementsIntoNewList(33);
		
		System.out.println();
		
		list.print();
		System.out.println();
		System.out.println("first element of old list is " + list.getFirst() + " and last element is " + list.getLast());
		System.out.println();
		first10ElementsList.print();
		System.out.println();
		System.out.println("first element of new list is " + first10ElementsList.getFirst() + " and last element is " + first10ElementsList.getLast());
	}

}

