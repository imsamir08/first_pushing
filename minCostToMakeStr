public class mctomst {
    public static void main(String[] args) {
        String s="abdfh";
        String t="afoiwer";
        int c1=2;
        int c2=4;
        int[][] dp=new int[s.length()+1][t.length()+1];
        System.out.println(minCostToMakeStr(s, t, c1, c2, dp));
    }
    public static int minCostToMakeStr(String s,String t,int c1,int c2,int[][] dp){
        // find first LCS -> Longest common subsequence
        for(int i=dp.length-1; i>=0; i--){
            for(int j=dp[0].length-1; j>=0; j--){
                if(i==dp.length-2 && j==dp[0].length-1){
                    dp[i][j]=0;
                }else if(i==dp.length-1){
                    dp[i][j]=0;
                }else if(j==dp[0].length-1){
                    dp[i][j]=0;

                }else{
                    if(s.charAt(i)==t.charAt(j)){
                        dp[i][j]=1+dp[i+1][j+1];
                    }else{
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                    }
                }
            }
        }
        int lcs=dp[0][0];
        // min cost
        int sr = s.length()-lcs;
        int tr = t.length()-lcs;
        return sr*c1+tr*c2;
    }
}
