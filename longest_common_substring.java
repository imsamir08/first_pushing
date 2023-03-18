public class longest_common_substring {
    public static void main(String[] args) {
        String s="ABCDGH", t = "ACDGHR";
        int[][] dp=new int[s.length()+1][t.length()+1];
        System.out.println(LCSubstring(s, t,dp));
    }
    public static int LCSubstring(String s,String t,int[][] dp){
        int mx=0;
        for(int i=1;i<dp.length; i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
                mx=Math.max(mx,dp[i][j]);
            }
        }
        return mx;
    }
}
