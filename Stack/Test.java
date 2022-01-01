public class Test {
    public static void main(String[] args) throws  Exception{
        StackFromArray stack=new StackFromArray();

        stack.push(20);
        stack.push(50);

        stack.print();
        System.out.println(stack.pop());
        stack.print();
    }
}
