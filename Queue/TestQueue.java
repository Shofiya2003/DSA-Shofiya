public class TestQueue {
    public static void main(String[] args) throws Exception{
       LinkedListQueue queue=new LinkedListQueue();
       queue.enQueue(33);
       queue.enQueue(23);
       queue.print();
       queue.enQueue(11);
       queue.enQueue(90);
        queue.print();
       queue.deQueue();
        queue.print();
        queue.enQueue(29);
        queue.deQueue();
        System.out.println(queue.size());
        System.out.println(queue.size());


    }
}
