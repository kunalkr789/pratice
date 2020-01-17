package queue1;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
	Queue<Integer> q1 = new LinkedList<Integer>(); 
    Queue<Integer> q2 = new LinkedList<Integer>(); 

    int size; 

    public StackUsingQueue() 
    { 
        size = 0; 
    } 

    public void push(int x) 
    { 
    	if (q1.peek() == null) {
            q1.add(x);
        } else {
            for (int i = q1.size(); i > 0; i--) {
                q2.add(q1.remove());
            }
            q1.add(x);
            for (int j = q2.size(); j > 0; j--) {
                q1.add(q2.remove());
            }

        }
    } 

    public Integer pop() 
    { 
    	 if (q1.peek() == null) {
             return 0;
         } else {
             int pop = q1.remove();
             return pop;
         }
    } 

    public int top() 
    { 
        if (q1.isEmpty()) 
            return -1; 
        return q1.peek(); 
    } 

    public int getSize() 
    { 
        return q1.size(); 
    } 
    public Queue<Integer> getQueue() {
    	System.out.println(q1.peek()+"front");
		return q1;   	 
    }

}
