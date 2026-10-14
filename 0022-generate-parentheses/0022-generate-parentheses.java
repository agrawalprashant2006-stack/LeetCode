class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> l = new ArrayList<>();
        Parentheses(n, 0, 0, "",l);
        return l;
    }
    public static void Parentheses(int n, int open, int closed, String ans,List<String> l){
        if(open == n && closed == n){
          l.add(ans);
            return ;
        }
        if(open> n || closed>open){
            return;
        }
        Parentheses(n, open+1, closed, ans+"(",l);
        Parentheses(n, open, closed+1, ans+")",l);
    }
}