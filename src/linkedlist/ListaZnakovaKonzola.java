package linkedlist;

public class ListaZnakovaKonzola {

	public static void main(String[] args) {
		
		ListaZnakova lista = new ListaZnakova();
		
		lista.add('A');
		lista.add('3');
		lista.add('g');
		lista.add('Q');
		lista.add('7');
		lista.add('A');
		lista.add('c');
		lista.add('k');
		lista.add('1');
		lista.add('C');
		
		
		
		System.out.println(lista);
		
		System.out.println("Lista sadrzi " + lista.size() + " elemenata.");
		
		lista.printUpperCaseLetters();
		
		lista.removeAllLowerCaseLetters();
		System.out.println();
		
		System.out.println(lista);
		System.out.println("Lista sadrzi " + lista.size() + " elemenata.");
		
		System.out.println();
		
		ListaZnakova listaBrojeva = lista.splitNumbersIntoNewList();
		
		System.out.println(listaBrojeva);
		System.out.println();
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(listaBrojeva.size());
		
		lista.add('t');
		
		System.out.println(lista);
		
		listaBrojeva.add('9');
		
		System.out.println(listaBrojeva);
		
	}

}
