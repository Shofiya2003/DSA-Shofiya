public class TestQueue {
    public static void main(String[] args) throws Exception{
       DynamicCirArrQueue queue=new DynamicCirArrQueue();
       queue.enQueue(33);
       queue.enQueue(23);
       queue.print();
       queue.enQueue(11);
       queue.enQueue(90);
       queue.deQueue();
       queue.print();
        System.out.println(queue.size());


    }
}
