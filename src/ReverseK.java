import java.util.Queue;
import java.util.Stack;

public class ReverseK {

    void reverseKElements(int k, Queue<Integer> q)
    {
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<k;i++){
            int top=q.peek();
            st.push(top);
            q.remove();
        }

        while(st.size()!=0){
            int top=st.peek();
            q.add(top);
            st.pop();
        }

        for(int i=0;i<q.size()-k;i++){
            q.add(q.peek());
            q.remove();
        }


        //print the queue
    }
}
