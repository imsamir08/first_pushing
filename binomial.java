public class binomial {
     public static void main(String[] args) {
        int n=15;
        int r=3;
        int[] dp=new int[n+1];
        System.out.println(bin_(n,r,dp));
     }
    //  public static int fac(int n,int[] dp){
    //     if(n==0 || n==1) return 1;
    //     int fac=n*fac(n-1,dp); //n*dp[n-1];
    //     return dp[]=fac;
    //  }
    public static int fac_(int n,int[] dp){
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=i*dp[i-1];
        }
        return dp[n];
    }
    public static long bin_(int n,int r,int[] dp){
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=i*dp[i-1];
        }
        // System.out.println(dp[r]);
        // System.out.println(dp[n-r]);
        int div=dp[n-r]*dp[r];
        int ans = dp[n]/div;
        return (long)(ans*Math.pow(10,9)+7);
    }
}
