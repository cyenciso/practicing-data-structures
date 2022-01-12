package arrays.examples;

@SuppressWarnings("unchecked")
public class DynamicArray <T> {

	// base array
	private T[] array = (T[]) new Object[3];
	
	// capacity
	private int capacity = 3;
	
	// length
	private int length = 0;
	
	// add(el)
	public void add(T element) {
		// check if we need to increase size of array
		if (length == capacity) {
			// create larger array
			T[] temp = (T[]) new Object[capacity * 2];
			
			// copy elements
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			
			// reference larger array
			array = temp;
		}
		
		// add to end of array
		array[length] = element;
		length++;
	}
	
	// add(el, index)
	public void add(T element, int index) {
		// check if we need to increase size of array
		if (length == capacity) {
			// create larger array
			T[] temp = (T[]) new Object[capacity * 2];
			
			// copy elements
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			
			// reference larger array
			array = temp;
		}

		// shift elements forward
		for (int i = length - 1; i > -1; i--) {
			if (i >= index) {
				array[i + 1] = array[i];
			}
			
			// add element to array at index
			if (i == index) {
				array[i] = element;
			}
		}
		
		length++;
	}
	
	// remove(el)
	public void remove(T element) {
		int index = -1;
		
		// find index
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				index = i;
			}
		}
		
		// shift elements backward
		if (index != -1) {
			for (int i = index; i < array.length; i++) {
				// only shift if it isn't the last element
				if (i < array.length - 1) {
					array[i] = array[i + 1];
				}
			}
			length--;
		}
	}
	
	public String toString() {
		String string = "[";
		
		for (int i = 0; i < length; i++) {
			// don't print null elements
			if (array[i] != null) {
				string += array[i];
			}
			
			// add a comma after any elements that are
			// not last
			if (i != length - 1 && array[i + 1] != null) {
				string += ", ";
			}
		}
		
		string += "]";
		
		return string;
	}
}
