public class Main {

        public static void main(String[] args) {
            DisjointSet ds = new DisjointSet(7);
            ds.unionBySize(1,2);
            ds.unionBySize(2,3);
            ds.unionBySize(4,5);
            ds.unionBySize(6,7);
            if(ds.getUltimateParent(5) == ds.getUltimateParent(6)){
                System.out.println("same component");
            }
            else System.out.println("not same");
            ds.unionBySize(5,6);
            if(ds.getUltimateParent(5) == ds.getUltimateParent(6)){
                System.out.println("same component");
            }
            else {
                System.out.println("not same");
            }
        }
}


