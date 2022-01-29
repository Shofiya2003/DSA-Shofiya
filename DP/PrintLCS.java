import java.util.Scanner;

public class PrintLCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();
        String ans=printlcs(a,b);
        System.out.println(ans);
    }

    static String printlcs(String a,String b){
        int n=a.length();
        int m=b.length();
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }

                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        StringBuilder res=new StringBuilder();
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                res.append(a.charAt(i-1));
                i--;
                j--;
            }

            else{
                if(t[i-1][j]>t[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }

        String ans=res.toString();
        res=new StringBuilder();
        for(int k=ans.length()-1;k>=0;k--){
            res.append(ans.charAt(k));
        }
        return res.toString();
    }
}
