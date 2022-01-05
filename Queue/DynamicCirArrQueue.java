public class DynamicCirArrQueue {
    int rear;
    int front;
    int size;
    static int CAPACITY=16;
    int capacity;
    int[] aq;

    DynamicCirArrQueue(){
        this(CAPACITY);
    }

    DynamicCirArrQueue(int capacity){
        aq=new int[capacity];
        size=0;
        rear=0;
        front=0;
        this.capacity=capacity;
    }

    public int size(){
        return size;
    }

    public void enQueue(int value){
        if(size==capacity) expand();
        size++;
        aq[rear]=value;
        rear=(rear+1)%capacity;
    }

    public int deQueue() throws Exception{
        if(size==0){
            throw new Exception("Queue is empty");
        }
        int res=aq[front];
        size--;
        aq[front]=Integer.MIN_VALUE;
        front=(front+1)%capacity;
        return res;
    }

    public void expand(){

        capacity*=2;
        int[] newaq=new int[capacity];
        for(int i=front;i<rear;i++){
            newaq[i-front]=aq[front];
        }
        front=0;
        rear=size;
    }

    public void print(){
        for(int i=front;i<rear;i++){
            System.out.print(aq[i]+" ");
        }
        System.out.println();
    }

}
