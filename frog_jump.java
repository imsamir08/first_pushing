import java.util.*;
public class frog_jump {
    public static void main(String[] args) {
        int arr[]={10 ,20 ,30, 10};
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(jumping(arr,arr.length-1,dp));
    }
    public static int jumping(int[] arr,int i,int[] dp){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int Onestep= jumping(arr,i-1,dp)+Math.abs(arr[i]-arr[i-1]);
        int twoStep=Integer.MAX_VALUE;
        if(i>1)
        twoStep= jumping(arr,i-2,dp)+Math.abs(arr[i]-arr[i-2]);
        return dp[i]=Math.min(Onestep,twoStep);
    }
}
