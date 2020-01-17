package queue1;


class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}
public class queueUsingLL2<T> {
	//queueUsingLL2<Integer> q1 = new queueUsingLL2<Integer>(); 
	//queueUsingLL2<Integer> q2;// = new queueUsingLL2<Integer>(); 

    int size; 

    private Node<T> front;
	private Node<T> rear;
	public queueUsingLL2() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T dequeue() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}

	public T front() {
		
//		if(front == null) {
//			throw new QueueEmptyException();
//		}
		return front.data;
	}

}
class StackUsingQueue1<T> {
	queueUsingLL2<Integer> q1 = new queueUsingLL2<Integer>(); 
	queueUsingLL2<Integer> q2 = new queueUsingLL2<Integer>(); 

    int size; 

    public StackUsingQueue1() 
    { 
        size = 0; 
    } 

    public void push(int x)
    { 
//    	if (q1.front() == null) {
//            q1.enqueue(x);
//        } else {
//            for (int i = q1.size(); i > 0; i--) {
//                q2.enqueue(q1.dequeue());
//            }
//            q1.enqueue(x);
//            for (int j = q2.size(); j > 0; j--) {
//                q1.enqueue(q2.dequeue());
//            }
//
//        }
    	//System.out.println(q1.peek()+"front");
    	q1.enqueue(x);
    } 

    public Integer pop() throws QueueEmptyException 
    { 
    	 if (q1.front() == null) {
             return 0;
         } else {
             int pop = q1.dequeue();
             return pop;
         }
    } 

    public int top() throws QueueEmptyException 
    { 
        if (q1.isEmpty()) 
            return -1; 
        return q1.front(); 
    } 

    public int getSize() 
    { 
        return q1.size(); 
    } 
    public queueUsingLL2<Integer> getQueue() throws QueueEmptyException {
    	System.out.println(q1.front()+"front");
		return q1;
   	 
    }

}
