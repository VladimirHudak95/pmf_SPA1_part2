package linkedlist;

public class ListTest {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for(int i = 0; i < 50; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(47);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		MyLinkedList<Integer> oneElementList = new MyLinkedList<>();
		
		oneElementList.add(123);
		
		System.out.println(oneElementList.getFirst() + " and " + oneElementList.getLast());
		
		oneElementList.remove(0);
		
		System.out.println(oneElementList.getFirst() + " and " + oneElementList.getLast());
		System.out.println();
		
		System.out.println(list.getFirst() + " and " + list.getLast());
		System.out.println(list.getFirst() + " and " + list.getLast());
		
		list.reverse();		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.getFirst() + " and " + list.getLast());
		
		MyLinkedList<Integer> twoElementList = new MyLinkedList<>();
		twoElementList.add(5);
		twoElementList.add(7);
		
		System.out.println(twoElementList.getFirst() + " and " + twoElementList.getLast());
		
		
		twoElementList.reverse();
		
		System.out.println(twoElementList.getFirst() + " and " + twoElementList.getLast());
				
	}

}

