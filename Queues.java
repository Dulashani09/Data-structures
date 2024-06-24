package Data;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		// creating a queue
		Queue<String> queue = new LinkedList<>();
		
		// checking whether the queue is empty or not
		System.out.println(queue.isEmpty());
		
		// adding elements to the queue 
		queue.offer("John");
		queue.offer("Henry");
		queue.offer("Leo");
		queue.offer("Oscar");
		queue.offer("Ario");
		queue.offer("Michael");
		queue.offer("William");
		
		System.out.println(queue);
		
		// checking whether the queue is empty or not
		System.out.println(queue.isEmpty());
		
		// checking the size of the queue
		System.out.println(queue.size());
		
		// checking whether the element is contained in the queue		
		System.out.println(queue.contains("Leo"));
		System.out.println(queue.contains("Simon"));
		
		// remove the elements
		queue.poll();
		queue.poll();
		
		// print queue after removing elements
		System.out.println(queue);
		
		// find the element at the top of the queue
		System.out.println(queue.peek());
	}

}
