package Data;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		// creating a stack
		Stack<Integer> stack = new Stack<>();
		
		// checking whether the stack is empty or not  
		System.out.println(stack.empty());

		// push elements into the stack
		stack.push(18);
		stack.push(35);
		stack.push(27);
		stack.push(73);
		stack.push(46);
		
		// print the stack
		System.out.println(stack);
		
		// find the element at the top of the stack
		int peek = stack.peek();
		System.out.println("Element at the top of the stack: "+peek);
		
		// search a element in the stack
		int search = stack.search(27);
		System.out.println("Element is in the position : "+search);
		
		// pop elements from the stack
		stack.pop();
		stack.pop();
		
		// print the stack after popping elements
		System.out.println(stack);
	}

}
