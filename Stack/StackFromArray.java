

public class StackFromArray {
    protected final static int length=10;
    int capacity;
    int top=-1;
    protected int[] stack;
    StackFromArray(){
        this(length);
    }
    StackFromArray(int size){
        capacity=size;
        stack=new int[size];
    }

    //GET SIZE
    public int size(){
        return top+1;
    }

    //ISEmpty
    public boolean isEmpty(){
        return top==-1;
    }

    //isFull
    public boolean isFull(){
        return top==capacity-1;
    }

    //push
    public void push(int num) throws Exception {
        if(!this.isFull()){
            stack[++top]=num;
        }
        else throw new Exception("Stack is Full");
    }

    //pop
    public int pop() throws Exception{
        if(this.isEmpty()) throw new Exception("Stack is empty");
        int removedNum=stack[top];
        stack[top--]=Integer.MIN_VALUE;
        return removedNum;
    }

    //peek
    public int peek() throws Exception{
        if(this.isEmpty()) throw  new Exception("Stack is Empty");
        return stack[top];
    }

    //print
    public void print(){
        for (int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }




}
