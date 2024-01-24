public class stringbuilder {
    public static void main(String ars[])
    {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("java");
        sb.insert(1,"sayan");
        System.out.println(sb);
        sb.replace(1,3,"JAVA");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        System.out.println("Reverse is :"+sb.reverse());
        StringBuilder sb1=new StringBuilder();
        System.out.println("Default capacity :"+sb1.capacity());
        sb1.append("sayan");
        System.out.println("Current capacity :"+sb1.capacity());
        sb1.append("Java is my favourite language");
        System.out.println("Now capacity is :"+sb1.capacity());

    }
}
