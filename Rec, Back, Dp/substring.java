public class substring {
    public static void main(String[] args) {
        int n=3;
        fun(n, "");
    }
    public static void fun(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        fun(n-1,ans+'H');
        fun(n-1, ans+'T');
    }
}
