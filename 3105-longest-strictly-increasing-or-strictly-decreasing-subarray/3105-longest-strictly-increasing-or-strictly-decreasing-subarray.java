class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int len1 = 1;
            int len2 = 1;
            for(int j = i+1; j<nums.length; j++){
                if(nums[j]<nums[j-1]){
                    len1++;
                }else{
                    break;
                } 
            }
                for(int j = i+1; j<nums.length; j++){
                  if(nums[j]>nums[j-1]){
                    len2++;
                  }else{
                      break;
                   }
            }
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        return maxLen;
    }
}