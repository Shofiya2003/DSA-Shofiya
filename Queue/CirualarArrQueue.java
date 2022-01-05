import java.security.spec.ECField;

public class CirualarArrQueue {



    static int length=16;
    int rear; int front;
    int size; int capacity;
    private int[] aq;
    CirualarArrQueue(int capacity) {
        this.capacity = capacity;
        aq=new int[capacity];
        rear = 0;
        front = 0;
        size = 0;
    }
    CirualarArrQueue(){

        this(length);
    }
    public int size(){
        return size;
    }

    public void enQueue(int value) throws Exception{
        if(size==capacity){
            throw new Exception("Queue is full");
        }
        else{
            size++;
            aq[rear]=value;
            rear=(rear+1)%capacity;
        }
    }

    public void deQueue() throws Exception {
        if(size==0){
            throw new Exception("Queue is Empty");
        }
        else{
            size--;
            aq[front]=Integer.MIN_VALUE;
            front=(front+1)%capacity;
        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public void print(){
        for(int i=front;i<rear;i++){
            System.out.print(aq[i%capacity]+" ");
        }
        System.out.println();
    }








}
