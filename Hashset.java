import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Set<Integer>hs=new HashSet<Integer>();
       Set<Integer>hs1=new HashSet<Integer>();
       hs1.add(10);
       hs.add(12);
       hs.add(23);
       hs.add(100);
       hs.add(500);
       hs.addAll(hs1);
       System.out.println(hs);
       boolean b=hs.add(12);
       System.out.println(b);
        hs.remove(2);
       System.out.println(hs);
       System.out.println("12 is present in the set "+hs.contains(12));
       System.out.println(hs.equals(hs1));
       System.out.println("Hash code of 1st has set is :"+hs.hashCode());
       Iterator itr=hs.iterator();
       while(itr.hasNext())
       {
           System.out.print(itr.next()+" ");
       }
    }
}