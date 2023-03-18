public class catalan{
    public static void main(String[] args) {
        int N=3;
        System.out.println(prefixStrings_(N,0,0,""));
    }
    public static String prefixStrings_(int N,int one,int zero,String ans)
    {
        if(one < N*2){
            prefixStrings_(N,one+1,zero,ans+1);
        }
        if(zero<=one){
            prefixStrings_(N,one,zero+1,ans+0);
        }
        return ans;
    }
}