package StackImpl;

public class SimpleStack {

    private int arr[] = new int[7];
    private int top = -1;
    private int MAX_CAPACITY = 7;


    /**
     *  insert value to the stack
     * @param x
     */
    public void push(int x) {

        //overflow
        if(isFull()) {
            return;
        } else {
            arr[++top] = x;
        }
       
    }

    /**
     *  validate if stac is full
     * @return
     */
    private boolean isFull() {
        if(top == MAX_CAPACITY - 1){
            return true;
        }  else{
            return false;
        }
    }

    /**
     * validates if stack is empty
     * @return
     */
    public int pop(){

        // undeflow
        if(isEmpty()){
            return top;
        } else {
            //first return the value with top and then decrements the top
            return arr[top--];
        }
    }

    /**
     * return top element of stack
     * @return
     */
    public int peek(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return top;
        } else {
            return arr[top];
        }
    }

    /**
     * verififes if stack is empty
     * @return
     */
    private boolean isEmpty(){
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *  print values in stack
     */
    public void printStack(){
        System.out.println("printing stack info");
        int i = 0;
        while( i <= top) {
            System.out.println("value in Stack is " + arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        SimpleStack stk = new SimpleStack();

        System.out.println("performing push operation");
        stk.push(4);
        stk.push(6);
        stk.printStack();

        System.out.println("performing pop operation");
        stk.pop();
        stk.printStack();

        System.out.println("performing push operation");
        stk.push(7);
        stk.printStack();

        System.out.println("performing peek operation " + stk.peek());
    }
}
