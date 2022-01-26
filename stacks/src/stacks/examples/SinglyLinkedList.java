package stacks.examples;

public class SinglyLinkedList<T> {
	
	// fields
	private Node<T> head;
	private Node<T> tail;
	
	// add
	public boolean add(Node<T> node) {
		// if empty
		if(head == null) {
			// make new node the head and tail
			head = node; 
			tail = node;
		} else {
			// start with head
			Node<T> runner = head; 
			
			// go down the nodes until you get to the very end
			while(runner.getNext() != null) {
				runner = runner.getNext();
			}
			// attach new node to old end of list
			runner.setNext(node);
			
			// make new node the tail
			tail = node;
		}
		
		return true; 
	}

	public boolean add(T value) {
		Node<T> newNode = new Node<T>(value);
		return add(newNode); 
	}
	
	// remove
	public Node<T> remove() {
		// if empty
		if(head != null)  {
			Node<T> runner = head;
			
			// iterate over list
			while (runner != null) {
				// find node before tail
				if (runner.getNext() == tail) {
					Node<T> removed = runner.getNext();
					runner.setNext(null);
					tail = runner;
					return removed;
				}
				// if node isn't before tail, continue iterating
				runner = runner.getNext();
			}
		}
		
		// return null otherwise
		return null;
	}
	
	// getters
	public Node<T> getTail() {
		return tail;
	}
	
	public Node<T> getHead() {
		return head;
	}
	
	// toString
	public String toString() {
		String string = "[";
		
		Node<T> runner = head;
		
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
