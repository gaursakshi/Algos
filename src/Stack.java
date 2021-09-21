import java.util.ArrayList;
import java.util.Stack;

class Stack1 {
    public static void main(String args[]){

         String str="(())";
         solve(str);

        }
    public static void solve(String str){
        Stack<Integer> st=new Stack<Integer>();

        ArrayList<Integer> ans=new ArrayList<>();
        int count=1;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(count);
                ans.add(count);
                count++;
            }
            else if(ch==')'){
                if(st.size()!=0) {
                    int x = st.pop();
                    ans.add(x);
                }

            }
        }
        System.out.println(ans);


    }


}
