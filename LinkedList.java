import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        List<Integer> ll1=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll1.add(40);
        ll1.add(50);
        ll.add(3,500000);
        ll.addAll(ll1);
        System.out.println(ll);
        LinkedList<Integer>clone=(LinkedList<Integer>)ll.clone();
        System.out.println("Old linkedlist"+ll);
        System.out.println("New LinkedList"+clone);
        ll.set(2,0);
        ll.addFirst(1000);
        ll.remove(2);
        ll.set(1,5);
        System.out.println(ll);
        System.out.println(ll.get(0));

    }
}