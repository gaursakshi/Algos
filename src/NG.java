import java.util.Stack;

public class NG {

    void nextGreater(int []arr){

        Stack<Integer> st=new Stack<>();

        int ans[]=new int[arr.length];
        st.push(0); //store the first index of array

        for(int i=1;i<arr.length;i++){
            //traversing over the stack and next greater finding
            while( st.size()!=0 && arr[st.peek()]<arr[i]){
                //found the next greater
                int index=st.pop(); //remover the index from stack

                //answer making
                ans[index]=arr[i];
            }
            //finding the next greater for i element
            st.push(i);
        }

        //for the element that doest not have next greater in the array -1
        while(st.size()!=0){
            int index=st.pop();
            ans[index]=-1;
        }

        //print the ans

    }
}
