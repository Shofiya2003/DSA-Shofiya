public class Test {
    public static void main(String[] args) throws  Exception{

        DynamicStack stack=new DynamicStack();
        stack.push(67);
        stack.push(99);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.push(90);
        stack.push(78);
        stack.push(44);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.print();
    }
}
