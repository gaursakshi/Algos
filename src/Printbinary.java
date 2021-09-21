import java.util.LinkedList;
import java.util.Queue;

public class Printbinary {

    public static void gen(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String top=q.peek();
            q.remove();
            System.out.println(top);

            String s1=top;
            q.add(top+"0");
            q.add(s1+"1");
        }

    }
}
