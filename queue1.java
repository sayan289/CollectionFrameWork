import java.util.*;
public class queue1 {
    public static void main(String[] ars)
    {
        /*Queue<Integer> qq=new LinkedList<>();
        int i;
        for(i=0;i<5;i++)
        {
            qq.add(i);//Adding element in Fifo order
        }
        //System.out.println(qq);
        System.out.println(qq.peek());//to display the front or head of the queue
        System.out.println(qq.poll());//return the head of the queue and delete.
        int r=qq.remove();//remove the top of the queue
        Iterator itr=qq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/
        Queue<Integer> qq=new PriorityQueue<Integer>();
        qq.add(10);
        qq.add(15);
        qq.add(20);
        System.out.println(qq.peek());
        System.out.println(qq.poll());
    }
}
