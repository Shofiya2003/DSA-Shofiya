public class LinkedListQueue {
    Node head;
    Node tail;
    int size;
    LinkedListQueue(){
        size=0;
        head=null;
        tail=null;
    }

    public int size(){
        return size;
    }

    public void enQueue(int value){
        Node node=new Node(value,null);
        size++;
        if(head==null){
            head=node;
            tail=head;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }

    public int deQueue() throws Exception{

        if(head==null){
            throw new Exception("Queue is Empty");
        }

        int res=head.data;
        if(size==1){
            tail=null;
            head=null;
        }

        else{
            head=head.next;
        }
        size--;
        return res;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
