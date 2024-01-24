import java.util.*;
public class treeset1 {
    public static void main(String ars[])
    {
        /*Set<Integer> ss=new TreeSet<Integer>();
        ss.add(50);
        ss.add(12);
        ss.add(1);
        //System.out.println(ss);
        boolean ans=ss.contains(12);
        //System.out.println("12 is present in the set "+ans);*/
        NavigableSet<Integer> ss= new TreeSet<Integer>();
        ss.add(50);
        ss.add(12);
        ss.add(1);
        ss.add(500);
        int comp=2;
       System.out.println("First element is "+ss.first());
        System.out.println("Higher " + ss.higher(comp));//Find the value just greater than 50
        System.out.println("Lower " + ss.lower(comp));//Find the value just lower than 50
        ss.remove(500);
        System.out.println(ss);
    }
}
