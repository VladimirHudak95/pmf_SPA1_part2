package linkedlist;

import java.util.Scanner;

public class ListOfStringsConsole {

	public static void main(String[] args) {
		
		ListOfStrings list = new ListOfStrings();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of strings for input: ");
		int numberOfStrings = in.nextInt();
		in.nextLine();
		while (numberOfStrings > 0)  {
			System.out.println("String: ");
			String input = in.nextLine();
			list.add(input);
			numberOfStrings--;
		}
		
		list.print();
		
		System.out.println();
		System.out.println("All elements longer than 3 letters: ");
		System.out.println();
		
		list.printAllElementsLongerThanThree();
		
		System.out.println();
		System.out.println("Enter the String that you want to check: ");
		String element = in.nextLine();
		System.out.println();
		System.out.println("String '" + element + "' occured " + list.getNumberOfOccurrencesOfElements(element) + " times.");
		
		
		System.out.println();
		System.out.println("Last element of the list is: ");
		list.printLast();
		
		in.close();
		
		
		
	}

}
