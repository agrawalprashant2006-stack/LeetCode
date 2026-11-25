class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i<nums.size(); i++){
            int sum = 0;
            for(int j = i; j<nums.size(); j++){
                int len = j-i+1;
                sum+=nums.get(j);
                 if(sum>0 && (len>=l && len<=r)){
                   minSum = Math.min(sum, minSum);
                   }else if(len>r){
                    break;
                   }
            }
        }
        if(minSum == Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}