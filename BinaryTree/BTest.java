public class BTest {
    public static void main(String[] args) {
        BNode root=new BNode(2);
        root.right=new BNode(3);
        root.left=new BNode(4);
        root.right.left=new BNode(5);
    }
}
