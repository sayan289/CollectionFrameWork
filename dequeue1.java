import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue1 {
    public static void main(String ars[])
    {
        Deque<Integer>dq=new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        System.out.println(dq);
        dq.addFirst(20);
        dq.addLast(50);
        //System.out.println(dq);
        System.out.println("First element is "+dq.removeFirst());
        System.out.println("Last element is "+dq.removeLast());
        dq.offerFirst(20);
        dq.offerLast(50);
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        dq.clear();
        System.out.println(dq);
    }
}
