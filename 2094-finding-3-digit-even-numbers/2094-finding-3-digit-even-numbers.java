class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
       HashSet<Integer> set = new HashSet<>();        
        for(int i = 0; i<n; i++){
            if(digits[i] == 0) continue;
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    if(i == j || j == k || k == i) continue;
                    else{
                        if(digits[k]%2 == 0){
                            int num = digits[i]*100 + digits[j]*10 + digits[k];
                            set.add(num);
                        }
                    }
                }
            }
        }
        int ans[] = new int[set.size()];
       int i = 0;
       for(Integer x : set){
         ans[i] = x;
         i++;
       }
       Arrays.sort(ans);
        return ans;
    }
}