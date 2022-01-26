package stacks.examples;

public class Main {
	public static void main(String[] args) {
		NodeStack<Integer> nodeStack = new NodeStack<>();
		nodeStack.push(1);
		nodeStack.push(2);
		nodeStack.push(3);
		nodeStack.push(4);
		nodeStack.push(5);
		nodeStack.push(6);
		
		System.out.println(nodeStack.peek());
		nodeStack.pop();
		
		System.out.println(nodeStack);
		
		ArrayStack<Integer> arrayStack = new ArrayStack<>();
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(5);
		arrayStack.push(6);

		System.out.println(arrayStack.peek());
		arrayStack.pop();
		
		System.out.println(arrayStack);
	}
}
