package ll.examples;

import java.util.Objects;

public class Node<T> {
	
	// fields
	T data;
	Node<T> next;	
	
	// constructors
	public Node(T data) {
		this.data = data;
	}
	
	// getters and setters
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	// toString
	public String toString() {
		return data.toString();
	}
}
