package ll.examples;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		list.remove();
		
		System.out.println(list);
	}

}
