
class Node{
    int data;
    Node next;
    Node(){
        this(0,null);
    }
    Node(int val,Node node){
        data=val;
        next=node;
    }
}

public class LL {
    public Node head;

    LL(){
        Node node=new Node();
        head=node;
    }



}
