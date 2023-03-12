package linkedlist;

public class ListTest {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for(int i = 0; i < 5; i++) {
			list.add(i);
		}
		
		list.print();
		System.out.println("Size of list is " + list.size());
	
		MyLinkedList<Integer> oddList = list.splitOddIndexes();
		
		System.out.println();
		System.out.println("First element of old list is " + list.getFirst() + " and last element is " + list.getLast());
		System.out.println();
		System.out.println("Size of list is " + list.size());
		System.out.println();
		
		list.print();
		
		System.out.println();		
		System.out.println("First element of new list is " + oddList.getFirst() + " and last element is " + oddList.getLast());
		System.out.println();
		System.out.println("Size of list is " + oddList.size());
		System.out.println();
		
		oddList.print();
		
		System.out.println();
		
		Object [] array = list.toArray();
		for(int i = 0; i < array.length; i++) {	
			System.out.println(array[i]);
		}
		
		Integer[] newArray = new Integer [array.length];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = (Integer)array[i];
		}
		System.out.println();
		MyLinkedList<Integer> arrayList = new MyLinkedList<Integer>(newArray);
		arrayList.print();
		System.out.println();
		System.out.println(arrayList.size());
		
		list.addFromList(oddList);
		
		System.out.println();
		list.print();
					
			
	}

}

