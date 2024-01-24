import java.util.*;

public class priorityqueue1 {
    public static void main(String[]ars)
    {
        Queue<String>qq=new PriorityQueue<>();
        qq.add("geeks");
        qq.add("for");
        qq.add("geeks");
        qq.add("learned");
       //print elemet according to priority
        System.out.println(qq.peek());//It return the top elemet of the queue  but does not delete it
        System.out.println(qq);
        System.out.println(qq.poll());//It return the top elemet of the queue and delete it
        System.out.println(qq);
        qq.remove("geeks");
        System.out.println(qq);
        Iterator itr=qq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        qq.clear();
        System.out.println("If the queue is empty :"+qq.isEmpty());
    }
}
