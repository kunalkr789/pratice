package queue1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Runner{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			q.add(s.nextInt());
		}
		int k = s.nextInt();
		Queue<Integer> ans = Solution1.reverseKElements(q,k);
		while(!ans.isEmpty()){
			System.out.println(ans.remove()+" ");
		}
	}
}
