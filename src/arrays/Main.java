package arrays;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < ArraysOperations.size() - 1; i++) {
			ArraysOperations.addAndReplace(i, i);
		}
		
		System.out.println(ArraysOperations.print());
		
		System.out.println("Sum of all elements: " + ArraysOperations.SumOfAllValues());
		System.out.println("Multiplication of all elements: " + ArraysOperations.multiplyAllElementsExceptZero());
		System.out.println("Multiplication of all elements using recursion: " + ArraysOperations.multiplyAllElementsExceptZeroRecursion(0, ArraysOperations.size() - 1));
		
		ArraysOperations.addAtIndexAndShift(0, 20);
		
		System.out.println(ArraysOperations.print());
		
		System.out.println("Sum of all elements: " + ArraysOperations.SumOfAllValues());
		System.out.println("Multiplication of all elements: " + ArraysOperations.multiplyAllElementsExceptZero());
		System.out.println("Multiplication of all elements using recursion: " + ArraysOperations.multiplyAllElementsExceptZeroRecursion(0, ArraysOperations.size() - 1));
		
		ArraysOperations.delAtIndex(9);
		
		System.out.println(ArraysOperations.print());
		System.out.println("Sum of all elements: " + ArraysOperations.SumOfAllValues());

		System.out.println("Multiplication of all elements: " + ArraysOperations.multiplyAllElementsExceptZero());
		long res = ArraysOperations.multiplyAllElementsExceptZeroRecursion(0, ArraysOperations.size() - 1);
		System.out.println("Multiplication of all elements using recursion: " + res);
		
		
		
		
		
		
	}

}
