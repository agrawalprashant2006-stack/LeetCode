class Solution {
    public String longestPalindrome(String s) {
          return print(s);
    }
     public static String print(String s){
        String MaxAns = "";
        String ans = "";
    for(int i =0; i<s.length(); i++){
        for(int j = i+1; j<=s.length(); j++){
            if(isPalindrome(s.substring(i,j))){
               ans=s.substring(i,j);
               if(MaxAns.length()<ans.length()){
                MaxAns = ans;
               }
            }
        }
    }
    return MaxAns;
  }
  public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}