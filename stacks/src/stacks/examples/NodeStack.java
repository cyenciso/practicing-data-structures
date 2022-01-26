package stacks.examples;

public class NodeStack<T> {

	// fields
	private SinglyLinkedList<T> stack = new SinglyLinkedList<>();
	private Node<T> top = stack.getTail();
	
	// push
	public void push(T element) {
		stack.add(element);
	}
	
	// pop
	public Node<T> pop() {
		return stack.remove();
	}
	
	// peek
	public Node<T> peek() {
		return stack.getTail();
	}
	
	// toString
	public String toString() {
		String string = "[";
		
		Node<T> runner = stack.getHead();
		
		while (runner != null) {
			string += runner;
			 
			// add a comma after any elements that are
			// not last
			if (runner.next != null) {
				string += ", ";
			}
			
			runner = runner.getNext();
		}
		 
		string += "]";
		
		return string;
	}
}
