class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j<=i; j++){
            l.add(binomial_Expension(i, j));
        }
        ans.add(l);
       }
       return ans;
    }
     public static int factorial(int n) {
       int fact = 1;
       if(n==0 || n==1){
        fact = 1;
       }
       for (int i = 1; i <= n; i++) {
           fact*=i;
       }
       return fact;
   }
   public static int binomial_Expension(int n, int r) {
      long result = 1; 
      for (int i = 0; i < r; i++) {
         result = result * (n - i) / (i + 1);
          }
           return (int) result;
       
   }
}