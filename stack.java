import java.util.*;
public class stack {
    public static void main(String ars[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        Iterator itr=st.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        int[] nums = {0, 1,1};
        Stack<Integer>st1=new Stack<Integer>();

    }
}
