package arrays.examples;

public class Main {
	public static void main(String[] args) {
		DynamicArray<Integer> array = new DynamicArray<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(5);
		System.out.println(array);
		
		array.add(4, 3);
		System.out.println(array);
		
		array.remove(2);
		System.out.println(array);
	}
}
