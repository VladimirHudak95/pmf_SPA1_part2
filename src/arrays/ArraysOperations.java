package arrays;

public class ArraysOperations {

	private static int[] array = new int[10];
	
	public ArraysOperations() {
	}
	
	public static int size() {
		return array.length;
	}
	
	public static void addAndReplace(int index, int element) {
		if(index < 0 || index > array.length - 1) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		array[index] = element;
	}
	
	public static void addAtIndexAndShift(int index, int element) {
		if(index < 0 || index > array.length - 1) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		for(int i = array.length - 1; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = element;
	}
	
	public static void delAtIndex(int index) {
		
		if(index < 0 || index > array.length - 1) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		if(index == array.length - 1) {
			array[index] = 0;
			return;
		}
		
		for(int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = 0;
		
	}
	
	public static long multiplyAllElementsExceptZero() {
		long res = 1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				continue;
			}
			res *= array[i];
		}
		
		return res;
	}
	
	public static long multiplyAllElementsExceptZeroRecursion(int startIndex, int endIndex) {
		if(startIndex == endIndex) {
			return array[endIndex] == 0 ? 1 : array[endIndex];
		}else {
			return (array[startIndex] == 0 ? 1 : array[startIndex]) * multiplyAllElementsExceptZeroRecursion(startIndex + 1, endIndex);
		}
		
	}
	
	public static int SumOfAllValues() {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	

	public static String print() {
		String res = "Array { [";
		if(array.length == 0) {
			res += "] }";
		}
		for(int i = 0; i < array.length - 1; i++) {
			res += array[i] + "], [";
		}
		res += array[array.length - 1] + "] }";
		return res;
	}
	
}
