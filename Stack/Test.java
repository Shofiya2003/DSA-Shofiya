public class Test {
    public static void main(String[] args) throws  Exception{

       LinkedListStack llStack=new LinkedListStack();
       llStack.push(33);
       llStack.push(10);
       llStack.print();
       llStack.pop();
       llStack.print();
       llStack.push(1);
       llStack.print();
    }
}
