class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<>();
            for(int j = 0; j<=rowIndex; j++){
            ans.add(binomial_Expension(rowIndex, j));
       }
       return ans;
    }
   public static int binomial_Expension(int n, int r) {
      long result = 1; 
      for (int i = 0; i < r; i++) {
         result = result * (n - i) / (i + 1);
          }
           return (int) result;
}
}