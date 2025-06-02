package datastructures_algorithms;

import java.util.*;

public class PriorityQueueDS {
    public static void main(String[] args) {
	//Priority Queue = A FIFO data structure that serves elements
    //                             with the highest priorities first
    //				  before elements with lower priority

	// in default order
	Queue<Double> queue1 = new PriorityQueue<>();

		queue1.offer(3.5);
		queue1.offer(2.5);
		queue1.offer(2.0);
		queue1.offer(1.5);
		queue1.offer(2.1);

		System.out.println(queue1); //[1.5, 2.0, 2.5, 3.5, 2.1]

		while(!queue1.isEmpty()) {
			System.out.println(queue1.poll());
		}



		// in reverse order
	Queue<Double> queue3 = new PriorityQueue<>(Collections.reverseOrder());

		queue3.offer(3.5);
		queue3.offer(2.5);
		queue3.offer(2.0);
		queue3.offer(1.5);
		queue3.offer(2.1);

		System.out.println(queue3); //[3.5, 2.5, 2.0, 1.5, 2.1]

		while(!queue3.isEmpty()) {
			System.out.println(queue3.poll());
		}





		//Strings in default order
    Queue<String> queue2 = new PriorityQueue<>();

    //Strings in reverse order
    //Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

    	queue2.offer("B");
    	queue2.offer("C");
    	queue2.offer("A");
    	queue2.offer("F");
    	queue2.offer("D");

		System.out.println(queue2); //[A, C, B, F, D]
		//Because PriorityQueue’s toString() shows
		// the internal heap array order, not sorted order.

    	while(!queue2.isEmpty()) {
        System.out.println(queue2.poll());
        }


}
}