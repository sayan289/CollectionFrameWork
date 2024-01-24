import java.util.*;
public class Treemap {
    public static void main(String ars[])
    {
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(1,"Amit");
        tm.put(101,"Vijay");
        tm.put(102,"Rahul");
        for(Map.Entry m:tm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        NavigableMap<Integer,String> nm=new TreeMap<>();
        nm.put(1,"Amit");
        nm.put(101,"Vijay");
        nm.put(102,"Rahul");
        System.out.println("descendingMap: "+nm.descendingMap());
        System.out.println("Head Map :"+nm.headMap(101,true));//print the value who's key's value is less than 101
        System.out.println("Tail Map"+nm.tailMap(101,true));
        System.out.println(nm.subMap(101,false,102,true));
    }
}
