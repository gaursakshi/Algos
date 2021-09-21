import java.sql.SQLOutput;

public class first {

    static int MAX=100;
    int top;
    int arr[]=new int[MAX];

    first(){
        top=-1;
    }

    //push
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack1 is full");
            return false;
        }
        else{
            top++;
            arr[top]=x;
            System.out.println("element is pushed"+x);
            return true;
        }
    }


    //pop
    int pop(){
        if(top<0){
            System.out.println("Stack1 is empty");
            return -1;
        }
        else{
            int result=arr[top];
            top--;
            return result;
        }
    }


    //isEmpty
    boolean isEmpty(){
        if(top<0){
            return true; //true signifes stack is empty
        }
        else{
            return false;  ///false signifes stack is not empty

        }
    }


    //top
    int peek(){

        if(top<0){
            System.out.println("Stack1 is empty");
            return -1;
        }
        else{
            int result=arr[top];
            return result;
        }
    }


    public  static void main(String args[])
    {
        first s = new first();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
       // System.out.print("Elements present in stack :");

        //System.out.println("hello");
    }
}
