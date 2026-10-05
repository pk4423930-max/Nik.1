import java.util.LinkedList;
import java.util.Queue;
public class QueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
         while (!queue.isEmpty()) {
        System.out.println(queue.poll());
           

            
        
     }
    }
}