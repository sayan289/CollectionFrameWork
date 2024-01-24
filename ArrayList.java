import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
       ArrayList<Integer> al=new ArrayList<Integer>();
       ArrayList<Integer>al1=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al1.add(40);
        al1.add(50);
       al.remove(2);
        al.add(2,100);
        al.set(2,700);
        al.addAll(al1);
        System.out.println("Addall="+al);
        System.out.println(al);
        System.out.println(al.get(2));
       int b= al.indexOf(20);
       System.out.println(b);
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("geeks");
        al2.add("geeksfor");
        al2.add(2,"Hello");
       al1.remove(1);
       System.out.println(al.get(1));
        System.out.println(al1);
        if(al2.contains("geeks"))
        {
            System.out.println("Yes");
        }
    }
}