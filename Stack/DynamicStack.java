public class DynamicStack {
    int top=-1;
    protected final static int length=10;
    protected int increaseFactor=2;
    int capacity;
    int[] stack;

    DynamicStack(){
        this(length);
    }

    DynamicStack(int size){
        capacity=size;
        stack=new int[size];
    }

    //GET SIZE
    public int size(){
        return top+1;
    }

    //isEmpty
    public boolean isEmpty(){
        return top<0;
    }

    //push
    public void push(int num){
        if(top+1==capacity){
            resize(capacity*increaseFactor);
            capacity=capacity<<1;
        }
        stack[++top]=num;
    }

    //pop
    public int pop() throws Exception{
        if(this.isEmpty()) throw new Exception("Stack is empty");
        if(((capacity+1)*3)/4<top+1){
            resize(capacity/2);
            capacity=capacity/2;
        }
        int removedNumber=stack[top];
        stack[top--]=Integer.MIN_VALUE;
        return removedNumber;
    }

    //peek
    public int peek() throws Exception{
        if(this.isEmpty()) throw new Exception("Stack is Empty");
        return stack[top];

    }

    private void resize(int size) {
        int[] newStack=new int[size];
        for(int i=0;i<stack.length;i++){
            newStack[i]= stack[i];
        }
        stack=newStack;
    }

    //print
    public void print() throws Exception{
        if(top==-1){
            System.out.println();
           return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
