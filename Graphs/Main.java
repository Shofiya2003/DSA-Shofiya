public class Main {

        public static void main(String[] args) {
            DisjointSet ds = new DisjointSet(7);
            ds.unionByRank(1,2);
            ds.unionByRank(2,3);
            ds.unionByRank(4,5);
            ds.unionByRank(6,7);
            if(ds.getUltimateParent(5) == ds.getUltimateParent(6)){
                System.out.println("same component");
            }
            else System.out.println("not same");
            ds.unionByRank(5,6);
            if(ds.getUltimateParent(5) == ds.getUltimateParent(6)){
                System.out.println("same component");
            }
            else {
                System.out.println("not same");
            }
        }
}


