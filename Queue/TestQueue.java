public class TestQueue {
    public static void main(String[] args) throws Exception{
        CirualarArrQueue queue=new CirualarArrQueue();
        queue.enQueue(33);
        queue.enQueue(19);
        queue.print();
        queue.deQueue();
        queue.print();
        queue.enQueue(90);
        queue.print();
        System.out.println(queue.isEmpty());
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.isEmpty());

    }
}
