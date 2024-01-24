import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
     Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class hashmap2 {
        public static void main(String ars[])
        {
            Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
            Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
            Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
            Map<Integer,Book>map=new HashMap<>();
            map.put(1,b1);
            map.put(2,b2);
            map.put(3,b3);
            for(Map.Entry<Integer,Book> m:map.entrySet())
            {
                Book b=m.getValue();
                System.out.println(b.id+" "+b.name+" "+b.publisher);
            }
}
}
