import java.util.ArrayList;

public class rec1 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> ans = new ArrayList<>();
        makeParen(n, 0, 0,"", ans);
        System.out.println(ans);
    }

    public static void makeParen(int n, int open, int close, String s, ArrayList<String> ans) {
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if (open < n) {
            makeParen(n, open + 1, close, s + "{", ans);
        }
        if(close<open){
            makeParen(n, open, close+1, s+"}", ans);
        }
    }
}
