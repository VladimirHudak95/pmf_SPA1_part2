package linkedlist;

public class ListTest {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for(int i = 0; i < 500; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		
		Integer a = 100;
		Integer b = 0;
		Integer c = 499;
		Integer d = -50;
		Integer e = 500;
		
		if(list.remove(a)) {
			System.out.println("Uspesno!");
		} else {
			System.out.println("Neuspesno!");
		}
		if(list.remove(b)) {
			System.out.println("Uspesno!");
		} else {
			System.out.println("Neuspesno!");
		}
		if(list.remove(c)) {
			System.out.println("Uspesno!");
		} else {
			System.out.println("Neuspesno!");
		}
		if(list.remove(d)) {
			System.out.println("Uspesno!");
		} else {
			System.out.println("Neuspesno!");
		}
		if(list.remove(e)) {
			System.out.println("Uspesno!");
		} else {
			System.out.println("Neuspesno!");
		}
		
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		
		list.add(1488);
		list.add(9990);
		list.add(1111);
		
		System.out.println(list.size());
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		
		System.out.println();
		System.out.println();
		
		System.out.println(list.size());

	}

}

