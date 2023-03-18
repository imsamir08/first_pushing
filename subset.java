import java.util.*;
public class subset {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int t=10;
        int n=5;
        int[][] dp=new int[n][t+1];
	    for(int i=0;i<dp[0].length;i++){
            dp[0][i]=-1;
        }
	    System.out.println(pS(arr,n-1,t,dp));
	} 
	public static int pS(int[] arr,int i,int t,int[][] dp){
	    // if(t==0) return 1;
        if(i==0) {
            if(arr[0]==t) return 1;
            else return 0;
        }
	    if(dp[i][t]!=-1){
	        return dp[i][t];
	    }
	    int b=0;
	    int a=pS(arr,i-1,t,dp);
	    if(arr[i]<=t) b=pS(arr,i-1,t-arr[i],dp);
	    return dp[i][t]=(a+b);
	}
}
