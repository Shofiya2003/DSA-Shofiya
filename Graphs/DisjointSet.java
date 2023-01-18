
import java.util.ArrayList;
import java.util.List;
public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            this.rank.add(0);
            this.parent.add(i);
            size.add(1);
        }
    }

    public int getUltimateParent(int node){
        if(parent.get(node)==node) return node;
        int res = getUltimateParent(parent.get(node));
        parent.set(node,res);
        return parent.get(node);
    }

    public void unionByRank(int u,int v){
        int pu = getUltimateParent(u);
        int pv = getUltimateParent(v);

        if(rank.get(pu)>rank.get(pv)){
            parent.set(pv,pu);
        }

        else if(rank.get(pu)<rank.get(pv)){
            parent.set(pu,pv);
        }
        else{
            parent.set(pv,pu);
            rank.set(pu,rank.get(pu)+1);
        }

    }

    public void unionBySize(int u,int v){
        int pu = getUltimateParent(u);
        int pv = getUltimateParent(v);

        if(size.get(pu)>size.get(pv)){
            parent.set(pv,pu);
            size.set(pu,size.get(pv)+size.get(pu));
        }
        else{
            parent.set(pu,pv);
            size.set(pv,size.get(pv)+size.get(pu));
        }
    }
}
