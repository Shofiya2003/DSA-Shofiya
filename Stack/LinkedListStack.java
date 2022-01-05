

public class LinkedListStack {
    int length;
    Node head;
    LinkedListStack(){
        length=0;
        head=null;
    }

    //get size;
    public int size(){
        return length;
    }

    //isEmpty
    public boolean isEmpty(){
        return length==0;
    }

    //push
    public void push(int val){
        Node node=new Node(val,null);
        if(head==null) {
            head = node;
            return;
        }
        node.next=head;
        head=node;
    }


    //pop
    public int pop() throws Exception{
        if(head==null) throw new Exception("Stack is Empty");
        int removedNum=head.data;
        head=head.next;
        return removedNum;
    }

    //Peek
    public int peek() throws Exception{
        if(head==null) throw new Exception("Stack is Empty");
        return head.data;
    }


    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }





}
