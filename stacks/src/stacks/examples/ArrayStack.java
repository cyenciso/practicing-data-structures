package stacks.examples;

@SuppressWarnings("unchecked")
public class ArrayStack<T> {

	// fields
	private T[] stack = (T[]) new Object[5];
	private int topIndex = -1;
	
	// push
	public void push(T element) {
		// if array is full, double and replace
		if (topIndex == stack.length - 1) {
			T[] tempStack = (T[]) new Object[stack.length * 2];

			for (int j = 0; j < stack.length; j++) {
				tempStack[j] = stack[j];
			}
			
			stack = tempStack;
		}
		
		// increase top index
		topIndex++;
		
		// give array at that index the value we want to push
		stack[topIndex] = element;
	}
	
	// pop
	public T pop() {
		// if there is an element to remove
		if (topIndex >= 0) {
			// return value that is going to be removed
				// and then decrement lastElementIndex
			return stack[topIndex--]; 
			
			// element still there, 
			// but peek will only see element at lastElementIndex as the last element
			// and adding onto array will replace the "unseen" element
		} else {
			// nothing to remove
			return null;
		}
	}
	
	// peek
	public T peek() {
		// if there is an element to view
		if (topIndex >= 0) {
			// return that element
			return stack[topIndex];
		} else {
			// indicate there is nothing to view
			return null;
		}
	}
	
	// toString
	public String toString() {
		// create empty string
		String s = "[";
		// iterate over array
		 for (int i = 0; i <= topIndex; i++) {
			 // print not-null values only
			 if (stack[i] != null) {
				 s += stack[i];
			 }
			 
			 // if element isn't top element, print a comma
			 if( i < stack.length && i + 1 <= topIndex) {
				 s += ", ";
			 }
		 }
		 s += "]";
		 
		 // return concatenated string
		 return s;
	 }
}
