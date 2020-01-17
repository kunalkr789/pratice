package queue1;

import java.util.Queue;
import java.util.Stack;
public class Solution1{

	public static Queue<Integer> reverseKElements(Queue<Integer> q,int k){
		Stack<Integer> stk=new Stack<Integer>();
		int temp=k;
		int size=q.size();
		while(--temp>=0)
		{
			stk.push(q.remove());
	      
		}
		while(!stk.isEmpty())
		{
			q.add(stk.pop());
		}
		temp=size-k;
		while(temp-->0)
		{
			q.add(q.remove());
		}
		return q;

	}

}

