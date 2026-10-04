class Solution {
    public int dominantIndex(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
                ans = i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                continue;
            }
            if(nums[i]>max/2){
                   return -1;
            }
        }
        return ans;
    }
}