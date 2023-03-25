 class subsequence{
    public static void main(String[] args) {
        String s="abc";
        fun(s, "");
    }
    public static void fun(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return; 
        }
        char ch=ques.charAt(0);
        fun(ques.substring(1), ans);
        fun(ques.substring(1),ans+ch);
    }
}