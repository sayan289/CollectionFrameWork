import java.util.*;
public class hashmap {
    public static void main(String ars[])
    {
        Map<Integer,String>map= new HashMap<>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"grapes");
        map.put(1,"greps");//replace the value of the 1 key
       /* for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        map.putIfAbsent(5,"sanglap");
        /*for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        Map<Integer,String> hm1=new HashMap<>();
        hm1.put(6,"sayan");
        map.putAll(hm1);
       /* for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        //map.remove(2);//key based elimination
        //map.remove(2,"Apple");key value based elimination
        map.put(3,"adhikary");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("greps"));
    }
}
