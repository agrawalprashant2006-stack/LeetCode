class Solution {
    public String reverseWords(String s) {
        List<String> l = new ArrayList<>();
         l.addAll(Arrays.asList(s.split(" ")));
         String ans = ""; 
         for(int i = 0; i<l.size(); i++){
             int k  = 0;
             int j  = l.get(i).length()-1;
            while(k<=j){
               ans+=l.get(i).charAt(j);
               j--;
            }
            if(i<l.size()-1){
                ans+=" ";
            }
         }
       return ans;
    }
}