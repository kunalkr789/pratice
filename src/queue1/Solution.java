package queue1;

public class Solution {
	public static void reverseQueue(Queue<Integer> q) {
		if(q.isEmpty())
			return;
		int data = q.front();
		q.dequeue();
		reverseQueue(q);
		q.enqueue(data);
	}


}
