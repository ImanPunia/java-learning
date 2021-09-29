package StackImpl;

//interleaving the nodes of the stack
class ThreeStackNode {

    private int previousNodeLink;
    private int stackValue ;

    ThreeStackNode(int stackValue, int previousNodeLink){
        this.stackValue = stackValue;
        this.previousNodeLink = previousNodeLink;
    }
    public int getPreviousNodeLink() {
        return previousNodeLink;
    }

    public void setPreviousNodeLink(int previousNodeLink) {
        this.previousNodeLink = previousNodeLink;
    }

    public int getStackValue() {
        return stackValue;
    }

    public void setStackValue(int stackValue) {
        this.stackValue = stackValue;
    }

}

class ThreeStackImp {
    
    private static final int MAX_CAPACITY = 15;

    private final ThreeStackNode[] arr = new ThreeStackNode[MAX_CAPACITY];

    //size of filled value in array
    private int size;

    //next available index
    private int availableIndex;

    //keeps track of top of previous node
    private final int[] previousNodeLink = {-1,-1,-1};

    ThreeStackImp() {
        initialze();
    }

    /**
     * intitalize the avialble enteries with type of threeStackNode object 
     */
    private void initialze() {
        for(int i = 0; i < arr.length; i++){
            arr[i] = new ThreeStackNode(0, i+1);
        }
    }

    /**
     * insertion of value 
     * @param stackNumber
     * @param value
     */
    public void push(int stackNumber, int value){
        int stack = stackNumber - 1;
        
        if(isFull()){
            System.out.println("overflow");
        } else {
            //fetch top value for that stack
            int top = previousNodeLink[stack];

            //fetched value of node at next available index in array;
            ThreeStackNode node = arr[availableIndex];

            //set the passesd data to vaialble index
            node.setStackValue(value);
            node.setPreviousNodeLink(top);

            //updates the top for given stack
            previousNodeLink[stack] = availableIndex;

            //updates the next available index
            availableIndex++;

            //increments the total occupied value 
            size++;
        }

    }

    /**
     * removal of value
     * @param stackNumber
     * @return
     */
    public ThreeStackNode pop(int stackNumber) {
        int stack = stackNumber -1;
        int top = previousNodeLink[stack];

        if(!isEmpty(top)){
            System.out.println("underflow");
        }

        //fetched the data of node to be popped
        ThreeStackNode node = arr[top];

        //updates the backlink after popping
        arr[top].setPreviousNodeLink(availableIndex);

        //updates the top for given stack
        previousNodeLink[stack] = node.getPreviousNodeLink();

        //updates the nextfreeslot to top as it points to the current poppedelement index
        availableIndex = top;

        //decrements the occupied values in array
        size--;

        return node;

    }

    private boolean isEmpty(int top){
        if(top == -1) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isFull() {
        if(size >= MAX_CAPACITY) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ThreeStackImp stk1 = new ThreeStackImp();
        
        stk1.push(1, 101);
        stk1.push(1, 1001);

        stk1.push(2, 202);
        stk1.pop(1);
        
        stk1.push(3, 303);
        stk1.pop(2);
    
    }


}



//Reference: https://github.com/PacktPublishing/The-Complete-Coding-Interview-Guide-in-Java