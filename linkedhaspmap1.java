import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhaspmap1 {
    public static void main(String ars[])
    {
        LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
        lm.put(1,"Amit");
        lm.put(101,"Vijay");
        lm.put(102,"Rahul");
        for(Map.Entry m: lm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Keys are "+lm.keySet());
        System.out.println(lm.values());
        lm.remove(1,"Amit");
        for(Map.Entry m: lm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
