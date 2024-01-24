import java.util.*;
public class hashtabel {
    public static void main(String ars[])
    {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"apple");
        ht.put(2,"banana");
        ht.put(3,"grep");
        for(Map.Entry m:ht.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
