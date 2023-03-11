package arrays;

public class Main {

	public static void main(String[] args) {
		long programStart = System.nanoTime();
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

		long startTime1 = System.nanoTime();
		System.out.println("Multiplication of all elements: " + ArraysOperations.multiplyAllElementsExceptZero());
		long stopTime1 = System.nanoTime();
		System.out.println(stopTime1 - startTime1 + " ns");
		long startTime2 = System.nanoTime();
		System.out.println("Multiplication of all elements using recursion: " + ArraysOperations.multiplyAllElementsExceptZeroRecursion(0, ArraysOperations.size() - 1));
		long stopTime2 = System.nanoTime();
		System.out.println(stopTime2 - startTime2 + " ns");
		long programEnd = System.nanoTime();
		System.out.println();
		System.out.println(((programEnd - programStart) / 1000000) +  "." + ((programEnd - programStart) % 1000000) + " milliseconds");
		
	}

}
