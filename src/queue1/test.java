package queue1;

import java.util.Queue;
import java.util.Scanner;

public class test {
	public static void main(String args[]) throws QueueEmptyException{
		StackUsingQueue1<Integer> s = new StackUsingQueue1<>();
        Scanner sc = new Scanner(System.in);
        int choice; 
        int input;
            
        while(true){
                
            choice = sc.nextInt();
                
            switch(choice){
                case 1:
                    input = sc.nextInt();
					s.push(input);
					break;
//                case 2:
//
//                    Integer ele = s.pop();
//
//                    if(ele != null) {
//                        System.out.println(ele);
//                    } else {
//                        System.out.println(-1);
//                    }
//                    break;
//                case 3:
//                    Integer elem = s.top();
//                    if(elem != null) {
//                        System.out.println(elem);
//                    } else {
//                        System.out.println(-1);
//                    }
//                    break;
//                case 4 :
//                    System.out.println(s.getSize());
//                    break;
                case 5 : // Test
                	queueUsingLL2<Integer> q = s.getQueue();
                    while(!q.isEmpty()) {
                        Integer e = q.front();
                        q.dequeue();
                        System.out.print(e + " ");
                    }   
                    System.out.println();
                    return;
                default:
                    return;
            }
        }
	}
}
