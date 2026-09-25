class Solution {
    public int maximumDifference(int[] nums) {
        int minDiff = -1;
        int diff = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
            if(nums[i]<nums[j]){
                diff = nums[j]-nums[i];
                if(diff>minDiff){
                  minDiff = diff;
                 }
            }
        }
        }
        return minDiff;
    }
}